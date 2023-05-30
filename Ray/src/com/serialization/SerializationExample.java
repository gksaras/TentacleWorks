package com.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Marvel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String movieName;
	private int releaseYear;
	private Boolean mcu;
	private transient String favouriteMovie;

	public Marvel(String movieName, int releaseYear, Boolean mcu) {
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.mcu = mcu;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Boolean getMcu() {
		return mcu;
	}

	public void setMcu(Boolean mcu) {
		this.mcu = mcu;
	}

	public String getFavouriteMovie() {
		return favouriteMovie;
	}

	public void setFavouriteMovie(String favouriteMovie) {
		this.favouriteMovie = favouriteMovie;
	}

	@Override
	public String toString() {
		return "Marvel{" + "MovieName='" + movieName + '\'' + ", ReleaseYear=" + releaseYear + ", MCU=" + mcu
				+ ", FavouriteMovie='" + favouriteMovie + '\'' + '}';
	}

}

class DC implements Serializable {
	private static final long serialVersionUID = 2L;
	private transient String movieName;
	private transient int year = 2023;
	private static char type = 'C';

	{
		this.year = 2014;
	}

	public DC() {
		this.movieName = "Unknown";
		this.year = 2012;
		this.type = 'Q';
	}

	public DC(String movieName, int year, char type) {
		this.movieName = movieName;
		this.year = year;
		this.type = type;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static char getType() {
		return type;
	}

	public static void setType(char type) {
		DC.type = type;
	}

	@Override
	public String toString() {
		return "Chimpanzee{" + "name='" + movieName + '\'' + ", age=" + year + '}';
	}
}

class Sony extends DC {

	private static final long serialVersionUID = 3L;

	private String movie = "SpiderMan";

	public Sony() {
		super();
	}

	public Sony(String movie, char type) {
		super(movie, 0, type);
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Sony{" + "Movie='" + movie + '\'' + '}';
	}
}

class StoringData {

	void saveToFile(List<Marvel> marvel, File dataFile) throws FileNotFoundException, IOException {

		try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			for (Marvel marvels : marvel) {
				out.writeObject(marvels);
			}
		}
	}

	List<Marvel> readFromFile(File dataFile) throws ClassNotFoundException, IOException {

		var marvel = new ArrayList<Marvel>();

		try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {

			while (true) {
				var object = in.readObject();
				if (object instanceof Marvel m) {
					marvel.add(m);
				}
			}
		} catch (EOFException e) {
			// File end reached
			System.out.println(e);
		}
		return marvel;

	}
}

public class SerializationExample {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		var marvel = new ArrayList<Marvel>();

		marvel.add(new Marvel("The Marvels", 2023, true));
		marvel.add(new Marvel("Loki-2", 2023, true));
		marvel.add(new Marvel("Kang Dynasty", 2025, true));

		File dataFile = new File("marvel.data");
		StoringData sd = new StoringData();

		// Serialization
		sd.saveToFile(marvel, dataFile);

		// DE-Serialization
		var marvelFromDisk = sd.readFromFile(dataFile);
		System.out.println(marvelFromDisk);
	}
}
