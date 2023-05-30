package why;

import java.util.ArrayList;
import java.util.Scanner;


public class BankUser {

	public static void main(String args[]) {	
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<UserDetails> list = new ArrayList<UserDetails>();
		
		UserDetails detail = new UserDetails();
		
		detail.setUserName("Joseph");
		detail.setPassword("JosephBank#007");
		detail.setAccNo(3265160710839l);
		detail.setIfsc("SBI0001295");
		detail.setPhone(9871424103l);
		detail.setAddress("177A, Bleecker Street, Manhattan's Greenwich Village - 600616");
			
		list.add(detail);
		
		System.out.println("user ;");
		String u = sc.nextLine();
		System.out.println("pass ;");
		String p = sc.nextLine();
		
		for (UserDetails bank : list) {	
				
			if(bank.getUserName().equals(u)&&bank.getPassword().equals(p)) {
				System.out.println("Name : "+bank.getUserName()+"\n"
							+"Password : "+bank.getPassword()+"\n"
							+"Acc.No : "+bank.getAccNo()+"\n"
							+"IFSC : "+bank.getIfsc()+"\n"
							+"Phone : "+bank.getPhone()+"\n"
							+"Address : "+bank.getAddress());
			}
				else {
			System.out.println("Un-Authorized User");
		}
		}
		}
}
