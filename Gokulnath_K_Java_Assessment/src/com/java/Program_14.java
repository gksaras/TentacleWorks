package com.java;

import java.util.Arrays;

// Finding the character with the most appearances
public class Program_14 {

	public static void main(String[] args) {

		String str = "HelloWorld";

		int freq[] = new int[str.length()];

		char maxChar = str.charAt(0);

		int i, j, max;

		char[] ch = str.toCharArray();

		for (i = 0; i < ch.length; i++) {

			freq[i] = 1;

			for (j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '0') {
					freq[i]++;
					ch[j] = '0';
				}
			}
		}
		System.out.println(Arrays.toString(ch));

		max = freq[0];

		for (i = 0; i < freq.length; i++) {

			if (max < freq[i]) {
				max = freq[i];
				maxChar = ch[i];
			}
		}
		System.out.println(maxChar);
	}
}
