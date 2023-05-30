package com.bankanalyzer.BankStatementAnalyzer_Gokulnath_K;

import java.io.FileWriter;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Summarize implements FilterData { // This class Follows Open_Closed Principle
		
	@Override
	public void filter_And_Summarize(List<Transaction> List) {

		double sum = 0;
		int count = 0;
		
		System.out.println();
		System.out.println("Filtered Data.....");
			
		try(FileWriter txt = new FileWriter("E:\\Report.txt");){
		for (Transaction bank : List) {

			if (Month.FEBRUARY.equals(bank.getDate().getMonth())) {
				
				System.out.print("date : " + bank.getDate() + ", ");
				System.out.print("amount : " + bank.getAmount() + ", ");
				System.out.print("description : " + bank.getDescription());
				System.out.println();

				sum += bank.getAmount();
				count++;
				
				//Transaction max = bank.stream().max((p1,p2)->p1.getAmount > p2.getAmount? 1,-1).get();
				
				txt.write("Date = "+bank.getDate()+","
						+"Amount = "+bank.getAmount()+","
						+"Description ="+bank.getDescription()+"\n");
					
			}
			
		}
		
		txt.write("Summarized Data"+"\n"
		+"Sum of Transactions for fitered Data => "+sum+"\n"
		+"Average of all Sum for Filtered Data => "+sum/count);
	
		txt.flush();
		txt.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Summarized Data.....");
		System.out.println("Sum of Transcations for Filtered Data => " + sum);
		System.out.println("Average of all Sum for Filtered Data => " + sum / count);
		System.out.println("\nThanks For Connecting.....");
		
	}

}
