package other;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

class Transaction{
	
	private LocalDate date;
	private double amount;
	private String description;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}


public class BankingStatement {

	static String csvFile = "E:\\bank.csv";
	static String txtFile = "E:\\Report.txt";
	
	public static void main(String[] args) throws IOException, CsvValidationException, NumberFormatException {
		
		display_Transactions();
		
	}
	
	public static void display_Transactions() throws IOException, CsvValidationException, NumberFormatException {
		
		List<Transaction> transactionList = new ArrayList<>();
		
		CSVReader read = null;
		
		read = new CSVReader(new FileReader(csvFile));
		
		String[] field;
				
		while((field = read.readNext())!= null) {
				
			System.out.println(field[0]+" "+field[1]+" "+field[2]);
			
			Transaction transact = new Transaction();
					
			LocalDate date = LocalDate.parse(field[0],DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			double amount = Double.parseDouble(field[1]);
			String description = field[2];
					
			transactionList.add(transact);
		}
			
		generate_Summary(transactionList);
	}
	
	public static void generate_Summary(List<Transaction> List) throws IOException {
		
		try(FileWriter txt = new FileWriter(txtFile);){
		
		for (Transaction t : List) {
			if(t.getAmount()>1000) {
				System.out.println(t.getDate()+","+t.getAmount()+","+t.getDescription());
			}
			txt.write("Amount = "+t.getAmount()+" "+"Date = "+t.getDate()+" "+"Description ="+t.getDescription());
			
		}
		txt.flush();
		txt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
