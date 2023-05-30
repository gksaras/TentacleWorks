package com.java;

// Removing Given Characters
public class Program_13 {

	public static String removeGivenCharacter(String str, char ch) {

		System.out.println("Original String : " + str);
		String removedStr = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ch) {
				removedStr = removedStr + str.charAt(i);
			}
		}
		return removedStr;
	}

	public static void main(String[] args) {

		String result = removeGivenCharacter("Apple", 'p');
		System.out.println("String after removed character : " + result);

	}
}
