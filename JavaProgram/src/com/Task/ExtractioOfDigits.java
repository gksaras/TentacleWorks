package com.Task;

public class ExtractioOfDigits {

	static void extractDigits(final int startValue) {
		int remainingValue = startValue;
		while (remainingValue > 0) {
			final int digit = remainingValue % 10;
			System.out.println(digit + " ");

			remainingValue = remainingValue / 10;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		extractDigits(123);
	}
}
