package com.math;

// CheckSum
public class Exercise_6 {

	static int calcCheckSum(String input) {

		Integer num = Integer.valueOf(input);
		int integerValue = num.intValue();
		System.out.println(integerValue);

		int multiplier = 1, calculatedValue = 0, valueSum = 0, remainder;
		
		while (integerValue > 0) {
			
			remainder = integerValue % 10;
			
			calculatedValue = calculatedValue + remainder * multiplier;
			
			valueSum = valueSum + calculatedValue;
			
			integerValue = integerValue / 10;
			
			multiplier++;
		}
		return valueSum % 10;

	}

	public static void main(String[] args) {

		int result = calcCheckSum("87654321");
		System.out.println(result);

	}
}
