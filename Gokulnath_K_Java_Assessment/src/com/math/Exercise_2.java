package com.math;

// Number as Text
public class Exercise_2 {

	static String numberAsText(int number) {
		
		System.out.println(number);

		String words[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Ninie" };

		int numbers[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		String answer = "";

		while (number > 0) {

			int remainder = number % 10;

			for (int i = 0; i < numbers.length; i++) {

				if (remainder == numbers[i]) {
					answer = words[i] + " " + answer;
				}
			}
			number = number / 10;
		}
		return answer;
	}

	public static void main(String[] args) {

		String result = numberAsText(345);
		System.out.println(result);
	}
}