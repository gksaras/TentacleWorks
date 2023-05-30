package com.Task;

class A {
	
	// class variables or static variables stores default values
	static boolean bool;
	static byte by;
	static short sh;
	static char ch;
	static int i;
	static float f;
	static double d;
	static long l;
	static String s;
	
	public A() {

	}
	
	int x =10;
	
	public void doSomething(int a,float b) {
		
	}
}

public class Main extends A {

	@Override
	public void doSomething(int a, float b) {
	
	}
	
	public static void main(String[] args) {
		
		A obj = new A();
		System.out.println("Boolean = "+obj.bool);
		System.out.println("Byte = "+obj.by);
		System.out.println("Short = "+obj.sh);
		System.out.println("Character = "+obj.ch);
		System.out.println("Integer = "+obj.i);
		System.out.println("Float = "+obj.f);
		System.out.println("Double = "+obj.d);
		System.out.println("Long = "+obj.l);
		System.out.println("String = "+obj.s);
	}
}
