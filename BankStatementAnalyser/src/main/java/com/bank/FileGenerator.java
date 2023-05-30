package com.bank;

import java.io.FileWriter;
import java.io.Writer;

public class FileGenerator {

	// f.createFile(Path.of("E:\\summarized_data.txt"));

	// System.out.println(Files.exists(Path.of("E:\\summarized_data.txt")));
	
	public void generate() {
		
		Exporter e = new HtmlExporter();
		String s = e.export(new SummaryStatistics(11100, 6000, 100, 2775));
		System.out.println(s);

		MainApp m = new MainApp();

		BankStatementParser bankStatementParser = new BankStatementCSVParser();

		String result = bankStatementParser.toString() + "\n" + s;

		try {
			Writer w = new FileWriter("E:\\summarized_data.txt");

			w.write(result);
			w.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	// File f = new File("report.data"); 

}
