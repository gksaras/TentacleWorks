package com.java;

import java.util.Arrays;

// Sorting Array of String by its Length

public class Program_15 {

	public static void main(String[] args) {

		String s[] = { "Alpha", "Beta", "Marvel", "Ben" };

		System.out.println("String Array Before Sorting");
		System.out.println(Arrays.toString(s));

		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {

				if (s[i].length() > s[j].length()) {

					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("String Array After Sorting");
		System.out.println(Arrays.toString(s));
	}
}
