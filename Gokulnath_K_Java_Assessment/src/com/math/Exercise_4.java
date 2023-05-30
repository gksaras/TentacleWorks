package com.math;

import java.util.ArrayList;
import java.util.List;

// Prime Numbers
public class Exercise_4 {

	static List<Integer> calcPrimesUpTo(int numberLimit) {

		ArrayList<Integer> l = new ArrayList<>();
		 
		for (int input = 2; input <= numberLimit; input++) {
			
			int count = 0;
			
			for (int divisor = 2; divisor <= input / 2; divisor++) {
				
				if (input % divisor == 0) {
					count++;
				}
			}
			if (count == 0) {
				l.add(input);
			}
		}
		return l;
	}

	public static void main(String[] args) {

		List<Integer> primes = calcPrimesUpTo(50);
		System.out.println(primes);

	}
}
