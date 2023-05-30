package com.tentacle.SampleMavenProject.parser;

import java.util.List;

import com.tentacle.SampleMavenProject.domain.BankTransaction;

public interface BankStatementParser {

	BankTransaction parseFrom(String line);
	List<BankTransaction> parseLinesFrom(List<String> lines);
}

