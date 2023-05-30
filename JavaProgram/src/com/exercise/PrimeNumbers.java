package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	static List<Integer> calcPrimesUpTo(int num) {

		ArrayList<Integer> l = new ArrayList<>();
		 for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				l.add(i);
			}
		}
		return l;
	}

	public static void main(String[] args) {

		List<Integer> primes = calcPrimesUpTo(100);
		System.out.println(primes);

	}
}
