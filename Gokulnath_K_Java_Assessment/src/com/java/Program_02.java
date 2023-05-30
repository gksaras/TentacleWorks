package com.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

// Finding the first non-repeated characters in a String
public class Program_02 {

	static Character first_Non_Repeated_Character(String str) {

		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		int len = str.length();
		Character ch;

		for (int i = 0; i < len; i++) {
			
			ch = str.charAt(i);
			
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}

	public static void main(String[] args) {

		String str = "TenTech";

		char c = first_Non_Repeated_Character(str);
		System.out.println("First non-repeated character : "+c);

	}
}
