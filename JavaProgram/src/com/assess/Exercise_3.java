package com.assess;

// Reversing letters and words
public class Exercise_3 {

	public static void main(String[] args) {

		String str = "hello world java";
		String rev = "";

		String[] sp = str.split(" ");

		for (String w : sp) {
			String rw = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				rw += w.charAt(i);
			}
			rev = rev + rw + " ";
		}

		String[] r = rev.split(" ");
		String revWord = "";
		for (int i = 0; i < r.length; i++) {
			revWord = r[i] + " " + revWord;
		}
		System.out.println(revWord);
	}
}
