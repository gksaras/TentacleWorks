package com.fileparsing;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class CSVUpdate {

	public static void main(String[] args) throws IOException, CsvException {
		
		CSVReader read = new CSVReader(new FileReader(new File("E:\\bank-data-sample.csv")));
		
		List<String[]> data = read.readAll();
		//data.get(2)[3] = "gmat";
		System.out.println(data);
		
		//CSVWriter write = new CSVWriter(new FileWriter(new File("E:\\bank-data-sample.csv")));
		//write.writeAll(data);
		//write.flush();
	}
}
