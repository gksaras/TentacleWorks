package com.assess;

// Checking whether a string contains only digits
public class Exercise_4 {

	public static void main(String[] args) {

		String str = "Ten@2023";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println("String = " + str);
		String digit = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 48 && ch <= 57) {
				digit += ch;
			}
		}
		System.out.println(digit);
		System.out.println(digit.length());
		if (digit.length() == str.length())
			System.out.println("String contains digits only");
		else
			System.out.println("String contains all unicode characters");

	}
}
