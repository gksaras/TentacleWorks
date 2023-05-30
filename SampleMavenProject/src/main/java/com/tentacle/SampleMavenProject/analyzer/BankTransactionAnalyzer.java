package com.tentacle.SampleMavenProject.analyzer;

import com.tentacle.SampleMavenProject.domain.BankTransaction;
import com.tentacle.SampleMavenProject.parser.BankStatementParser;
import com.tentacle.SampleMavenProject.processor.BankStatementProcess;
import com.tentacle.SampleMavenProject.analyzer.BankTransactionAnalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankTransactionAnalyzer { // Explicit API

	public static final String csvFile = "E:\\bank.csv";
	
	public void analyze(BankStatementParser parser) throws IOException {
		
		Path path = Paths.get(csvFile);
		
		List<String> lines = Files.readAllLines(path);
		
		List<BankTransaction> transact = parser.parseLinesFrom(lines);
		
		BankStatementProcess process = new BankStatementProcess(transact);
		
		collectSummary(process);
	}
	
	private static void collectSummary(BankStatementProcess process) {
		
		System.out.println("ALL TRANSACTIONS TOTAL => "+process.total_Amount());
		
		System.out.println("TRANSACTIONS PER MONTH TOTAL => "+process.total_Per_Month(Month.FEBRUARY)
		+"\n"+process.total_Per_Month(Month.MAY));
		
		System.out.println("TRANSACTIONS FOR CATEGORY TOTAL => "+process.total_For_Category("Big Bazaar")
		+"\n"+process.total_For_Category("Salary")+"\n"+process.total_For_Category("Rent"));
		
	}
}
