package com.tentacle.SampleMavenProject.processor;

import com.tentacle.SampleMavenProject.domain.BankTransaction;

@FunctionalInterface
public interface BankTransactionSummarizer {

	double summarize(BankTransaction b);
}
