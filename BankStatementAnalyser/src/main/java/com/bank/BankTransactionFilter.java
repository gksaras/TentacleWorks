package com.bank;

@FunctionalInterface
public interface BankTransactionFilter {
	
	boolean test(BankTransaction bankTransaction);
}
