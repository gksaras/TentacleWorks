package com.java;

import java.util.Arrays;

// Removing Duplicate characters in a String
public class Program_12 {

	public static void main(String[] args) {

		String str = "Tentacle Tech";

		char[] ch = str.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		int len = ch.length;
		System.out.println(len);

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = ch[len - 1];
					len--;
					j--;
				}
			}
		}
		
		char d[] = Arrays.copyOf(ch, len);
		
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(d));
		
	}
}
