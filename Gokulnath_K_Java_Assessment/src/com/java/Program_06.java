package com.java;

import java.util.Scanner;

// Counting the occurrences of certain character in a String
public class Program_06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String str = "Tentacle Tech";
		System.out.println("String = "+str);
		
		int len = str.length();

		int count = 0;
		
		System.out.println("Enter the character : ");
		Scanner sc = new Scanner(System.in);
		char in = sc.next().charAt(0);
		
		for (int i = 0; i < len; i++) {

			char ch = str.charAt(i);

			if (ch == in) {
				count++;
			}
		}
		if (count > 1) 
			System.out.println(in + "=>" + count);
		else
			System.out.println("no occurences");
	}
}
