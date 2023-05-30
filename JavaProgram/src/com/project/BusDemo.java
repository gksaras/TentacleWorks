package com.project;

import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int userOption =1;
		while(userOption==1) {
			System.out.println("Enter 1 to Book or 2 to Exit");
			userOption=sc.nextInt();
			if (userOption==1) {
				System.out.println("Booking...."); 
			}
		}
		
	}
}
