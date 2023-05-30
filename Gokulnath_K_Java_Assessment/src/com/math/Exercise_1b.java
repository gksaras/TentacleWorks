package com.math;

// Statistics
public class Exercise_1b {

	static void calcSumAndCountAllNumbersDivBy_2_Or_7(int num) {

		int count = 0;
		int sum = 0;
		
		for (int i = 1; i < num; i++) {
			
			if (i % 2 == 0 || i % 7 == 0) {
				System.out.println("divisible by => " + i);
				sum += i;
				count++;
			}
		}
		System.out.println("Count = " + count);
		System.out.println("Sum = " + sum);

	}

	public static void main(String[] args) {

		calcSumAndCountAllNumbersDivBy_2_Or_7(15);
	}
}
