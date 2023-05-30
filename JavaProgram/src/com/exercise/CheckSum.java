package com.exercise;

public class CheckSum {

	static int calcCheckSum(String str) {

		Integer num = Integer.valueOf(str);
		int n = num.intValue();
		System.out.println(n);

		int i = 1, cal = 0, val = 0, rem;
		while (n > 0) {
			rem = n % 10;
			cal = cal + rem * i;
			val = val + cal;
			n = n / 10;
			i = i + 1;
		}
		return val % 10;

	}

	public static void main(String[] args) {

		int result = calcCheckSum("87654321");
		System.out.println(result);

	}
}
