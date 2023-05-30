package com.net;

public class Main {

	static void display(int a) {
		a++;
		System.out.println(a);
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		System.out.println(a);
		System.out.println(b);

		int c = ++a + a++ - b--; // ++a = 11 => a=11, a++ = 11

		System.out.println("c=" + c);

		System.out.println("a=" + a);

		System.out.println("b=" + b);

		// display(12);

	}
}
