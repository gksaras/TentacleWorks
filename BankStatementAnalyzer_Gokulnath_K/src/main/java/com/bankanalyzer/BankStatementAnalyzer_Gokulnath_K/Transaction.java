package com.bankanalyzer.BankStatementAnalyzer_Gokulnath_K;

import java.time.LocalDate;

public class Transaction { // POJO Class

	private LocalDate date;
	private double amount;
	private String description;
	 
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}	

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
