package com.assess;

// String Palindrome
public class Exercise_11 {

	public static void main(String[] args) {

		String s = "dood";
		System.out.println("Original String : "+s);
		
		String r = "";

		for (int i = 0; i < s.length(); i++) {
			r = s.charAt(i) + r;
		}
		System.out.println("Reversed String : "+r);
		
		if (r.equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
