package com.work;

public class BasePower {

	public static int multiplyPower(int base, int power) {
		
		int result = 1;
		
		for (int i = 1; i <= power; i++) {
			result = result * base;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		int answer = multiplyPower(2, 3);
		System.out.println(answer);
	}
}
