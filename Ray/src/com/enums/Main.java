package com.enums;

public class Main {

	private static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	private final void add(float a,float b) {
		System.out.println(a+b);
	}
	
	private  void add(double a,double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		var m = new Main();
		
		m.add(12, 21);
		m.add(12.45, 12.34);
		m.add(1.2424543543, 2.3454645645);
		
		
		
	}
}
