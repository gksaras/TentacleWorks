package com.assess;

import java.util.*;
import java.util.Map.Entry;

// Finding the first non-repeated characters
public class Exercise_2 {
	
	
	static Character first_Non_Repeated_Character(String str) {
		
		HashMap<Character,Integer> mp = new LinkedHashMap<Character, Integer>();
		
		int len = str.length();
		Character ch;
		
		for (int i = 0; i < len; i++) {
			ch=str.charAt(i);
			if (mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch) + 1);
			}
			else {
				mp.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> entry : mp.entrySet()) {
		
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return null;	
	}

	public static void main(String[] args) {
		
		String str = "TenTech";
		
		char c = first_Non_Repeated_Character(str);
		System.out.println(c);
		
	}
}
