package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {

	static List<Integer> calcPerfectNumbers(int num) {

		ArrayList<Integer> l = new ArrayList<>();
		int sum = 0;
		for (int i = num; i <= 10000; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				l.add(i);
			}
			sum = 0;

		}
		return l;
  
	}

	public static void main(String[] args) {

		List<Integer> result = calcPerfectNumbers(1);
		System.out.println(result);

	}
}
