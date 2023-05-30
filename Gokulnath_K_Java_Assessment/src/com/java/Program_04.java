package com.java;

// Check whether the String contains only digits
public class Program_04 {
	public static void main(String[] args) {

		String str = "Ten@2023";
	
		System.out.println("String = " + str);
		System.out.println("String Length = "+str.length());
		
		String digit = "";

		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (ch >= 48 && ch <= 57) {
				digit += ch;
			}
		}
		
		System.out.println("Digits = "+digit);
		System.out.println("Digits Length = "+digit.length());
		
		if (digit.length() == str.length())
			System.out.println("String contains digits only");
		else
			System.out.println("String contains all unicode characters");

	}
}
