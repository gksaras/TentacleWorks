package com.Task;

public class NumberOfDigits {

	static void countDigits(final int number) {
		int count = 0;
		int remainingValue = number;
		while (remainingValue > 0) {
			remainingValue = remainingValue / 10;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		countDigits(12345);
	}
}
