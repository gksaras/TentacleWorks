package com.bank;

import java.io.IOException;
import java.nio.file.Path;

public class MainApp extends CSVDetails {

	public static void main(String[] args) throws IOException {

		// f.createFile(Path.of(csv));

		boolean exists = f.exists(Path.of(csv));
		System.out.println(exists);

		csvWrite();

		cvsRead();

		System.out.println();

		UserDetails detail = new UserDetails();

		
		if (detail.userName.equals("joseph") && detail.password.equals("bankjoseph@123")) {

			detail.accountDetails();
			
			System.out.println();
			
			BankTransactionAnalyser bankTransactionAnalyzer = new BankTransactionAnalyser();

			BankStatementParser bankStatementParser = new BankStatementCSVParser();

			bankTransactionAnalyzer.analyze(bankStatementParser);

			System.out.println();		
			
		} 
		else {
			System.out.println("UnAuthorized User and Password");
		}
		

		FileGenerator format = new FileGenerator();
		format.generate();
	}
}
