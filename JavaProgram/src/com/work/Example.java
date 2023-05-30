package com.work;

public class Example {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = a + 1;
		int e = 4;
		int f = 8;

		int g = (a+=1) + b++ * c / e - --f; // 11 + 20 * 2.75 - 7
			
		System.out.println(g);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(c/e);
		
		int age = 12 - 5/2;
		System.out.println(age);

	}
}
