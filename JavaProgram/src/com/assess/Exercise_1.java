package com.assess;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Counting Duplicate Characters
public class Exercise_1 {

	public static void main(String[] args) {	

		String str = "Tentacle InfoTech";

		Map<Character, Integer> mp = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (mp.containsKey(ch)) {
				Integer value = mp.get(ch);
				value++;
				mp.put(ch, value);
			} 
			else {
				mp.put(ch, 1);
			}
		}
		System.out.println(mp);

		Set<Character> key = mp.keySet();
		for (Character c : key) {
			
			Integer i = mp.get(c);
			
			if (i > 1) {
				System.out.println(c + "=" + i);
			}
		}

	}
}
