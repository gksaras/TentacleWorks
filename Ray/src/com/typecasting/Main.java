package com.typecasting;

public class Main {

	public static void main(String[] args) {
		
		int a = 10_123_456_78; // Up casting - widening casting
		System.out.println("a => "+a);
		long l = (long)a;
		System.out.println("l => "+l);
		
		int b = 20_345_78; // Down casting - narrowing casting
		System.out.println("b => "+b);
		short s = (short)b;
		System.out.println("s => "+s);
	}
}
