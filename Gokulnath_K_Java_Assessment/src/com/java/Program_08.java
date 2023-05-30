package com.java;

// Removing white spaces in a  String
public class Program_08 {
	
	public static void main(String[] args) {

		String str = new String("Tentacle Tech");
		System.out.println("Original String = " + str);

		String resultStr = str.replaceAll(" ", "");
		System.out.println("String After removing white spaces = " + resultStr);

	}

}
