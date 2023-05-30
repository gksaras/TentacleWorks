package com.sample;

import java.io.IOException;

import com.bank.UserDetails;

public class ExecutionClass extends UserDetails{

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		String csvFile = "E:\\bank.csv";
		
		CSVFileReader fr = new CSVFileReader();
		fr.readCSV_And_Summarize(csvFile);
	}
}