package com.tentech;

public class Sample {

	public Sample() {
		number=5; // 3
	}
	public static void main(String[] args) {
		Sample e=new Sample();
		System.out.println(e.number); // answer=5
		
		int a=10_000;
		System.out.println(a);
	}
	private int number=3; // 1
	{number=4;} // 2
}
