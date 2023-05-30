package com.bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;

public class CSVDetails { // Open - Closed Principle
		static Files f;
		static String csv = "E:\\bank.csv";
		static BufferedReader br = null;

		static void csvWrite() {

			String data = "11-05-2022,-200,Petrol\n" + "15-05-2022,100,Rummy Circle\n" + "25-05-2022,-500,Zomato\n"
					+ "30-05-2022,-100,Swiggy\n" + "30-05-2022,-50,Big Bazaar\n" + "01-02-2022,6000,Salary\n"
					+ "02-02-2022,2000,SIP-Income\n" + "02-02-2022,-4000,Rent\n" + "03-02-2022,3000,Big Bazaar\n"
					+ "05-02-2022,-30,Cinema";

			try {
				Writer writer = new FileWriter("E:\\bank.csv");
				writer.write(data);
				writer.close();
			} catch (Exception e) {
				e.getStackTrace();
			}

		}

		@SuppressWarnings("resource")
		static void cvsRead() throws IOException {

			// String line=""; // String splitBy = ",";

			br = new BufferedReader(new FileReader(csv));
 
			while ((csv = br.readLine()) != null) {

				// String[] data = line.split(splitBy);

				// System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]);

				System.out.println(csv);
			}

			br.close();
		}
}
