package com.tentacle.SampleMavenProject.processor;

import com.tentacle.SampleMavenProject.domain.BankTransaction;

@FunctionalInterface
public interface BankStatementFilter {

	boolean test(BankTransaction b);
}
