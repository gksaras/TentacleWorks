package com.tentacle.SampleMavenProject.processor;

import java.time.Month;
import java.util.List;

import com.tentacle.SampleMavenProject.domain.BankTransaction;

import static java.util.stream.Collectors.toList;

public class BankStatementProcess {

	private final List<BankTransaction> transact;
	
	public BankStatementProcess(List<BankTransaction> transact) {
		
		this.transact = transact; 
	}
	
	// Calculating Total Amount based on different conditions
	public double total_Amount() {
		
		return summarize_Transactions(BankTransaction::getAmount);
	}
	
	public double total_Per_Month(Month month) {
		
		return summarize_Transactions(transact -> month.equals(transact.getDate().getMonth()) ? transact.getAmount() : 0);
	}
	
	public double total_For_Category(String category){
		
		return summarize_Transactions(transact -> category.equals(transact.getDescription()) ? transact.getAmount() : 0);
	}
	
	// Finding Transaction Details based on different conditions
	public List<BankTransaction> findTransaction_Greater_Than_1000(int amount){
		
		return find_Transaction(transact -> transact.getAmount() < amount);
	}
	
	public List<BankTransaction> findTransactions_Greater_Than_1000_PerMonth(int amount,Month month){
		
		return find_Transaction(transact -> month.equals(transact.getDate().getMonth()) && transact.getAmount() >= amount);
	}
	

    public List<BankTransaction> findTransactionsNonMonth( Month month) {
        return find_Transaction(transact -> !month.equals(transact.getDate().getMonth()));
    }
	
	
	// Methods to Summarize and Filter Data
	private double summarize_Transactions(BankTransactionSummarizer s) {
		
		return transact.stream().mapToDouble(s::summarize).sum();
	}
	
	private List<BankTransaction> find_Transaction(BankStatementFilter f){
		
		return transact.stream().filter(f::test).collect(toList());
	}
}
