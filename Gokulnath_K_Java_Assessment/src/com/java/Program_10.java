package com.java;

// Generating all permutations
public class Program_10 {

	static void generatePermutations(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans + " ");
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			String res = str.substring(0, i) + str.substring(i + 1);

			generatePermutations(res, ans + ch);
		}
	}

	public static void main(String[] args) {

		generatePermutations("abc", "");
	}
}
