package com.math;

// Roman Numbers -> Decimal Numbers
public class Exercise_7a {

	static int decimalValue(char romanLetter) {

		if (romanLetter == 'I' || romanLetter == 'i')
			return 1;
		if (romanLetter == 'V' || romanLetter == 'v')
			return 5;
		if (romanLetter == 'X' || romanLetter == 'x')
			return 10;
		if (romanLetter == 'L' || romanLetter == 'l')
			return 50;
		if (romanLetter == 'C' || romanLetter == 'c')
			return 100;
		if (romanLetter == 'D' || romanLetter == 'd')
			return 500;
		if (romanLetter == 'M' || romanLetter == 'm')
			return 1000;
		return -1;
	}

	static int fromRomanNumber(String romanNumber) {

		System.out.println(romanNumber);
		
		int decimalNumber = 0;

		for (int i = 0; i < romanNumber.length(); i++) {

			int firstRomanValue = decimalValue(romanNumber.charAt(i));

			if (i + 1 < romanNumber.length()) {

				int secondRomanValue = decimalValue(romanNumber.charAt(i + 1));

				if (firstRomanValue >= secondRomanValue)
					decimalNumber = decimalNumber + firstRomanValue;
				else
					decimalNumber = decimalNumber - firstRomanValue;
			} 
			else {
				decimalNumber = decimalNumber + firstRomanValue;
			}
		}
		return decimalNumber;
	}

	public static void main(String[] args) {

		int result = fromRomanNumber("xl");
		System.out.println(result);

	}
}
