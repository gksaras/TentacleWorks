package com.exercise;

// 
public class Max_Change_Calculator {

	static void calculateMax() {

		int input[] = { 1, 2, 3, 7 };

		int cal = 0;

		int j;

		int res[] = new int[25];

		for (int i = 0; i < input.length; i++) {

			for (j = 0; j <= i; j++) {

				cal = cal + input[i];

				res[j] = cal;

				System.out.println(res[j]);

			}
			cal = 0;
		}
	}

	public static void main(String[] args) {
		calculateMax();
	}
}
