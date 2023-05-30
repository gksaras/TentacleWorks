package com.tentech;

public class Main {
	
	private static int add(int a,int b) {
		return a+b;
	}

	private static int sub(int x,int y) {
		return x-y;
	}
	
	private static int mul(int c,int d) {
		return c*d;
	}
	
	private static int div(int p,int q) {
		return p/q;
	}
	
	private static void vowels(char c) {
		
		switch(c) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': 
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		int i = 5;
		int j = 3;
		System.out.println(add(i,j));
		System.out.println(sub(i,j));
		System.out.println(mul(i,j));
		System.out.println(div(i,j));
		
		vowels('H');
		
		System.out.println(2.0f - 1.1f);
	
		// type casting 
		int a = 234;
		float b = a; // widening casting
		System.out.println(b);
		
		double d = 235.4567;
		int c = (int) d; // narrowing casting
		System.out.println(c);
		
	}
}
