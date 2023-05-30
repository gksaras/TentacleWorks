package com.math;

// Basic Arithmetic Operations
public class Exercise_1a {
	
	static int calc(int m, int n) {

		int result = (m * n / 2) % 7;
		return result;
	}

	public static void main(String[] args) {
		
		int ans = calc(8, 7);
		System.out.println(ans);
	}

}
