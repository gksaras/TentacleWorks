package com.bank;

@FunctionalInterface
public interface BankTransactionSummarizer {
    
	double summarize(BankTransaction bankTransaction);
}
