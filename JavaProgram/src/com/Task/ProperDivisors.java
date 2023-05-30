package com.Task;

import java.util.ArrayList;
import java.util.List;

public class ProperDivisors {

	List<Integer> findDivisors(final int value){
		final List<Integer> divisors=new ArrayList<>();
			for (int i = 1; i <= value/2; i++) {
				if(value % i == 0) {
					divisors.add(i);
			}
		}
		return divisors;
	}
	public static void main(String[] args) {
		ProperDivisors p=new ProperDivisors();
		List<Integer> d= p.findDivisors(12);
		System.out.println(d);
	}
}
