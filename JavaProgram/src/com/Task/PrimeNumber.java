package com.Task;

import java.util.ArrayList;

public class PrimeNumber {

	static boolean isPrime(final int potentiallyPrime) {
		for (int i = 2; i <= potentiallyPrime / 2; i++) {
			if (potentiallyPrime % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		//boolean res = isPrime(7);
		//System.out.println(res);
		
		ArrayList<Integer> primes=new ArrayList<>();
		for (int i = 2; i < 25; i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		System.out.println(primes);
	}
}
