package com.work;

public class DataTypes {

	private static String getHexValue(int n) {
		StringBuilder s = new StringBuilder();
		if (n >= 0 && n <= 9) {
			s.append(n);
		} else {
			switch (n) {
			case 10:
				s.append("A");
				break;
			case 11:
				s.append("B");
				break;
			case 12:
				s.append("C");
				break;
			case 13:
				s.append("D");
				break;
			case 14:
				s.append("E");
				break;
			case 15:
				s.append("F");
			}
		}
		return s.toString();
	}

	public static void main(String[] args) {

		String hexString = "f";

		if (hexString.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}

		char ch = Character.toUpperCase(hexString.charAt(0));
		if (ch <= 'F' && ch >= 'A') {
			int value = ch - 'A' + 10;
			System.out.println(ch + " is " + value);
		} else if (Character.isDigit(ch)) {
			System.out.println(ch + " is " + ch);
		} else {
			System.out.println(ch + " is an invalid input");
		}

		int value;
		do {
			System.out.print("Enter a decimal value (0 to 15): ");
			value = 15;
		} while (value < 0 || value > 15);

		System.out.println("The hex value is " + getHexValue(value));
	}

}
