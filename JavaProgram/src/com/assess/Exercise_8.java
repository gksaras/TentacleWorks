package com.assess;

// Removing white spaces from a String
public class Exercise_8 {

	public static void main(String[] args) {
		
		String str = new String("Tentacle Tech");
		System.out.println("Original String = "+str);
		
		String resultStr = str.replaceAll(" ", "");
		System.out.println("String After removing white spaces = "+resultStr);
		
	}
}
