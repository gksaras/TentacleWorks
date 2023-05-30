package com.exercise;

public class Exercise_1c {

	public static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(int num) {
		if (num % 2 != 0)
			return true;
		return false;
	}

	public static void main(String[] args) {

		boolean even = isEven(12);
		System.out.println(even);
		boolean odd = isOdd(55);
		System.out.println(odd);
	}
}
