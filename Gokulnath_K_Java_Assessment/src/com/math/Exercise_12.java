package com.math;

import java.util.ArrayList;
import java.util.List;

// Prime Factorization
public class Exercise_12 {

	static List<Integer> calcPrimeFactors(int input) {

		ArrayList<Integer> list = new ArrayList<>();
		
		int divisor = 2;
		
		while (input > 1) {
		
			if (input % divisor == 0) {
				list.add(divisor);
				input /= divisor;
			} 
			else {
				divisor++;
			}
		}
		return list;
	}

	public static void main(String[] args) {

		List<Integer> primeFactors = calcPrimeFactors(14);
		System.out.println(primeFactors);
	}
}
