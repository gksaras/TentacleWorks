package com.math;

// Computation of a2 + b2 = c2
public class Exercise_8a {

	static void computeAllCombinations(int limit) {

		int a = 1;
		int b = a + 1;
		int c = b + 1;

		for (int i = a; i < limit; i++) {
			
			for (int j = b; j < limit; j++) {
				
				for (int k = c; k < limit; k++) {
					
					if (i * i + j * j == k * k) {
						System.out.println(i + " + " + j + " = " + k);
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		computeAllCombinations(100);
	}
}
