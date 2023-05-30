package com.bank;

import java.time.LocalDate;
import java.time.Month;

public class BankStatementAnalyser {

	static LocalDate d;
	
	private static void userDetails(String userName,long accNo) {
		
		System.out.println(userName+"\n"+accNo);
	}
	
	public static void earningIncome(double Salary,double SIP,double bigBazaar) {
		
		d = LocalDate.of(2022, Month.FEBRUARY,02 );
		System.out.println("Salary = "+Salary+" "+d);
		
		
		d = LocalDate.of(2022, Month.FEBRUARY,02 );
		System.out.println("SIP = "+SIP+" "+d);
	
		d = LocalDate.of(2022, Month.FEBRUARY,03 );
		System.out.println("BigBazaar = "+bigBazaar+" "+d);
		 
	}
	
	public static void spendingMoney(int rent,int bigBazaar,int swiggy,int cinema) {
		
		d = LocalDate.of(2022, Month.FEBRUARY,02 );
		System.out.println("Rent = "+rent+" "+d);
		
		d = LocalDate.of(2022, Month.MAY,30);
		System.out.println("BigBazaar = "+bigBazaar+" "+d);
		
		d = LocalDate.of(2022, Month.MAY,30 );
		System.out.println("Swiggy = "+swiggy+" "+d);
		
		d = LocalDate.of(2022, Month.FEBRUARY,05 );
		System.out.println("Cinema = "+cinema+" "+d);
		
//		int totalSpending = rent+bigBazaar+swiggy+cinema;
//		System.out.println(totalSpending);
	}
	
	static void calculateMoney() {
		 
	}
	
	public static void main(String[] args) {
		
		userDetails("John", 1240393973700081l);
		earningIncome(6000, 2000, 3000);
		spendingMoney(-4000, -50, -100, -30);
		calculateMoney();
		
	}
}
