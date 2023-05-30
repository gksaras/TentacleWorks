package com.work;

public class MinimumValue {

	static int findMin(int... vals) {

		int min = Integer.MAX_VALUE;

		for (int i : vals) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int result = findMin(3, 4, 5, 6, 2, 1, 7, 8, 9, 0, -1, -2);
		System.out.println(result);
	}
}
