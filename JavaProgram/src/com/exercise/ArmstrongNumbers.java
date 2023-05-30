package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {

	static List<Integer> calcArmstrongNumbers() {

		int sum = 0;
		int rem;
		ArrayList<Integer> l = new ArrayList<>();
		
		for (int input = 1; input <= 1000; input++) {
			int temp = input;
			while (temp > 0) {
				rem = temp % 10;
				sum = sum + (rem * rem * rem);
				temp /= 10;
			}

			if (sum == input)
				l.add(input);
			sum = 0;
		}
		return l;
	}

	public static void main(String[] args) {

		List<Integer> armstrong = calcArmstrongNumbers();
		System.out.println(armstrong);
	}
}
