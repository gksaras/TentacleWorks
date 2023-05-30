package com.exercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class RelatedNumbers {

	static Map<Integer, Integer> calcFriends(int num) {

		Map<Integer, Integer> m = new LinkedHashMap<>();
		
		int sum = 0;
		
		for (int i = 1; i < num; i++) {
			
			if (num % i == 0) {
				System.out.println(i);
				sum += i;
				m.put(num, sum);
			}
		}
		return m;
	}

	public static void main(String[] args) {

		Map<Integer, Integer> mp = calcFriends(284);

		System.out.println(mp);

	}
}
