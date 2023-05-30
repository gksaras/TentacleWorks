package com.bankanalyzer.BankStatementAnalyzer_Gokulnath_K;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;

public class CSVParser { // Single Responsibility Principle

	Scanner sc = new Scanner(System.in);
	
	List<Transaction> transactionList = new ArrayList<Transaction>();

	public void readCSV_And_ParseData(String csvFile) throws NumberFormatException, IOException {

		DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		CSVReader reader = null;

		reader = new CSVReader(new FileReader(csvFile));
		String[] line;
		
		
		System.out.println("\nAll Transaction Details.....");
		
		while ((line = reader.readNext()) != null) {

			System.out.println("date = " + line[0] + ", amount = " + line[1] + ", description =" + line[2]);
			
			Transaction transact = new Transaction();
			transact.setDate(LocalDate.parse(line[0], DATE_PATTERN));
			transact.setAmount(Double.parseDouble(line[1]));
			transact.setDescription(line[2]);
			transactionList.add(transact);

		}
		
		System.out.println("\nDo you want to Filter Data(y/n) : ");
		String option = sc.nextLine();
		
		if(option.equals("y")) {
		
		FilterData s = new Summarize();
		s.filter_And_Summarize(transactionList);
		} else {
			System.out.println("Thank You for Connecting.....");
		}
		
	}

}
