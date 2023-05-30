package com.assess;

import java.util.Scanner;

// Counting the occurrences of certain characters
public class Exercise_6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String str = "Tentacle Tech";
		int len = str.length();

		int count = 0;
		Scanner sc = new Scanner(System.in);
		char in = sc.next().charAt(0);
		for (int i = 0; i < len; i++) {

			char ch = str.charAt(i);

			if (ch == in) {
				count++;
			}
		}
		if (count > 1) {

			System.out.println(in + "=>" + count);
		}
	}
}
