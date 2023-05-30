package com.exercise;

public class Prime_Number_Pairs {

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int n = 50;
		for (int i = 2; i <= n - 6; i++) {
			
			if (isPrime(i) && isPrime(i + 6)) {
				System.out.println("(" + i + "," + (i + 6) + ") => sexy prime pair");
			}
			if (isPrime(i) && isPrime(i + 4)) {
				System.out.println("(" + i + "," + (i + 4) + ") => cousin prime pair");
			}
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.println("(" + i + "," + (i + 2) + ") => twin prime pair");
			}
		}
	}

}
