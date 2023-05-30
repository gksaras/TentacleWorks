package com.math;

import java.util.LinkedHashMap;
import java.util.Map;

// Related Numbers
public class Exercise_11 {

	static Map<Integer, Integer> calcFriends(int input) {

		Map<Integer, Integer> map = new LinkedHashMap<>();

		int sumValue = 0;

		for (int divisor = 1; divisor < input; divisor++) {

			if (input % divisor == 0) {
				System.out.println("divisible by => " + divisor);
				sumValue += divisor;
				map.put(input, sumValue);
			}
		}
		return map;
	}

	public static void main(String[] args) {

		Map<Integer, Integer> result = calcFriends(284);

		System.out.println(result);

	}
}
