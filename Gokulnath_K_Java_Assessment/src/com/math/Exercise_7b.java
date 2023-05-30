package com.math;

// Decimal Number -> Roman Number
public class Exercise_7b {

	static String toRomanNumber(int input) {

		System.out.println(input);

		int decimalValue[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String romanLetter[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		String romanNumber = "";

		for (int i = 0; i < decimalValue.length; i++) {
			
			while (input >= decimalValue[i]) {
				
				input = input - decimalValue[i];
				romanNumber = romanNumber + romanLetter[i];
			}
		}
		return romanNumber;
	}

	public static void main(String[] args) {

		String result = toRomanNumber(40);
		System.out.println(result);
	}
}
