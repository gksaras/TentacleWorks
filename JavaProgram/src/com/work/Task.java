package com.work;

public class Task {

	public static void main(String[] args) {

		int a = 10, b = 5, c = 1;

		int res = a - ++b - ++c;
		System.out.println(res);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println(a = b = c); // a=10 b=6 c=2
		// b=c => a=b

		int p = 10, q = 11, r = 4;
		int s = p / q * r; // left to right
		System.out.println(s);
	}
}
