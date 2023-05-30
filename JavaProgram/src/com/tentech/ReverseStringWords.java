package com.tentech;

import java.util.Arrays;

public class ReverseStringWords {

	public static void main(String[] args) {

		String[] str = { "Hello", "World" };
		System.out.println(Arrays.toString(str));

		String revWords = "";
		
		for (String w : str) {
			
			String rev = "";
			
			for (int i = w.length() - 1; i >= 0; i--) {
				
				rev = rev + w.charAt(i);
			}
			revWords = rev + " " + revWords;
		}
		System.out.println(revWords);
	}
}
