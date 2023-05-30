package com.math;

import java.util.ArrayList;
import java.util.List;

// Perfect Numbers
public class Exercise_3 {

	static List<Integer> calcPerfectNumbers(int startNumber) {

		ArrayList<Integer> list = new ArrayList<>();
		
		int sumValue = 0;
		
		for (int input = startNumber; input <= 10000; input++) {
			
			for (int divisor = 1; divisor < input; divisor++) {
				
				if (input % divisor == 0) {
					sumValue += divisor;
				}
			}
			if (sumValue == input) {
				list.add(input);
			}
			sumValue = 0;

		}
		return list;
  
	}

	public static void main(String[] args) {

		List<Integer> result = calcPerfectNumbers(1);
		System.out.println(result);

	}
}
