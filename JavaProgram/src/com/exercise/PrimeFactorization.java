package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	static List<Integer> calcPrimeFactors(int num) {

		ArrayList<Integer> l = new ArrayList<>();
		
		int i = 2;
		
		while (num > 1) {
		
			if (num % i == 0) {
				l.add(i);
				num /= i;
			} 
			else {
				i++;
			}
		}
		return l;
	}

	public static void main(String[] args) {

		List<Integer> primeFactors = calcPrimeFactors(14);
		System.out.println(primeFactors);
	}

}