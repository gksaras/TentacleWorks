package com.tentacle.SampleMavenProject.parser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.tentacle.SampleMavenProject.domain.BankTransaction;

import static java.util.stream.Collectors.toList;

public class BankStatementCSVParser implements BankStatementParser{

	private static final DateTimeFormatter date_Pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	@Override
	public BankTransaction parseFrom(String line) {
		
		String[] column = line.split(",");
		
		LocalDate date =  LocalDate.parse(column[0],date_Pattern);
		double amount = Double.parseDouble(column[1]);
		String description = column[2];
		
		return new BankTransaction(date, amount, description);
	}

	@Override
	public List<BankTransaction> parseLinesFrom(List<String> lines) {

		return lines.stream().map(this::parseFrom).collect(toList());
		
	}
	
}
