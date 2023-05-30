package com.exercise;

// Decimal to Roman
public class Exercise_7b {

	static String toRomanNumber(int num) {

		System.out.println(num);

		int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String roman[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		String sb = "";

		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num = num - values[i];
				sb += (roman[i]);
			}
		}
		return sb;
	}

	public static void main(String[] args) {

		String result = toRomanNumber(40);
		System.out.println(result);
	}
}
