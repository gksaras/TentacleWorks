package com.java;

// Reversing Letters and Words in a String
public class Program_03 {
	public static void main(String[] args) {

		String str = "hello world java";
		System.out.println("Original String : " + str);

		String revStr = "";

		String[] sp = str.split(" ");

		for (String w : sp) {

			String rw = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				rw += w.charAt(i);
			}
			revStr = revStr + rw + " ";
		}
		System.out.println("Reversed String without changing the word position : " + revStr);
		;

		String[] r = revStr.split(" ");

		String revWord = "";

		for (int i = 0; i < r.length; i++) {
			revWord = r[i] + " " + revWord;
		}
		System.out.println("Reversed String after changing the word position : " + revWord);
	}
}
