package com.math;

// Computation of a2 + b2 = c2 + d2
public class Exercise_8b {

	static void computeAllCombinations(int limit) {

		for (int a = 1; a < limit; a++) {
			
			for (int b = a + 1; b < limit; b++) {
				
				for (int c = b + 1; c < limit; c++) {
					
					for (int d = 0; d < limit; d++) {
						
						if (a * a + b * b == c * c + d * d) {
							System.out.println(a + " + " + b + " = " + c + " + " + d);
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		computeAllCombinations(100);
	}
}
