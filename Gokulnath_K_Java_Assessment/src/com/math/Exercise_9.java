package com.math;

import java.util.ArrayList;
import java.util.List;

// Armstrong Numbers
public class Exercise_9 {

	static List<Integer> calcArmstrongNumbers() {

		int sumValue = 0;
		int remainder;
		
		ArrayList<Integer> l = new ArrayList<>();
		
		for (int input = 1; input <= 1000; input++) {
			
			int temp = input;
			
			while (temp > 0) {
				remainder = temp % 10;
				sumValue = sumValue + (remainder * remainder * remainder);
				temp /= 10;
			}

			if (sumValue == input)
				l.add(input);
			sumValue = 0;
		}
		return l;
	}

	public static void main(String[] args) {

		List<Integer> armstrong = calcArmstrongNumbers();
		System.out.println(armstrong);
	}
}
