 package com.work;

public class OperatorPrecedence {

	public static void main(String[] args) {

		int a = 11;
		int b = 5;
		int c = 3;
		int d = 2;

		int e = a+=1 + b++ - c * d--;
		System.out.println("e = "+e);
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		int f=5;
		f+=1;
		System.out.println("f = "+f);
		
		int g=7;
		g++;
		System.out.println("g = "+g);
		
		int h=6;
		int i= 6 + --h;
		System.out.println("i = "+i);
		System.out.println("h = "+h);
		
	}
}
