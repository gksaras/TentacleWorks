package zero;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Filter {

	public static void main(String[] args) {

		String csvFile = "E:\\bank.csv";
		String line = "";
		String cvsSplitBy = ",";

		List<String> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] data = line.split(cvsSplitBy);

				for (int i = 0; i < data.length; i++) {

					list.add(data[i]);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

//			        for (Map.Entry<String, String> entry : map.entrySet()) {
//			            String spend = entry.getKey();
//			            String field = entry.getValue();
//			           // System.out.println("Spending [spend= " + spend + " , field=" + field + "]");
//			            System.out.println(spend);
//			        }

	}

}
