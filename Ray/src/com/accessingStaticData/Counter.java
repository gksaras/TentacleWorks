package com.accessingStaticData;

public class Counter {

	private static int count;

	public Counter() {
		count++; // count = 3
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		System.out.println(count);
	}
}
