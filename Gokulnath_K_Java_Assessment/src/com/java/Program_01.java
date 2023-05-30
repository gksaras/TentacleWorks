package com.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Counting Duplicate Characters in a String
public class Program_01 {

	public static void main(String[] args) {

		String str = "Tentacle InfoTech";

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				Integer value = map.get(ch);
				value++;
				map.put(ch, value);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

		Set<Character> key = map.keySet();

		for (Character c : key) {
			Integer i = map.get(c);
			if (i > 1) {
				System.out.println(c + "=" + i);
			}
		}

	}
}
