package com.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Month;
import java.util.List;

public class BankTransactionAnalyser { // Explicit API
	
	public static final String csvFlle= "E://bank.csv";

	    public void analyze(BankStatementParser parser) throws IOException{
	       
	    	Path path = Path.of(csvFlle);
	        List<String> lines = Files.readAllLines(path);

	        List<BankTransaction> bankTransactions = parser.parseLinesFrom(lines);
	        BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

	        collectSummary(bankStatementProcessor);
	    }

	    private static void collectSummary(BankStatementProcessor bankStatementProcessor) {
	        System.out.println("The total for all transactions is "
	                + bankStatementProcessor.calculateTotalAmount());

	        System.out.println("The total for transactions in May is "
	                + bankStatementProcessor.calculateTotalInMonth(Month.MAY));

	        System.out.println("The total for transactions in February is "
	                + bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));

	        System.out.println("The total salary received is "
	                + bankStatementProcessor.calculateTotalForCategory("Salary"));

	        System.out.println("The transactions of February and equal or bigger than 1_000 "
	                + bankStatementProcessor.findTransactionsEqualOrGreatherThanAndMonth(1_000, Month.FEBRUARY));

	        System.out.println("non-May transactions "
	                + bankStatementProcessor.findTransactionsNonMonth(Month.MAY));
	        
	        System.out.println("non-February transactions "
	                + bankStatementProcessor.findTransactionsNonMonth(Month.FEBRUARY));

	        System.out.println("The outcomes "
	                + bankStatementProcessor.findTransactionsLesserThan(500));
	        
	    }

}
