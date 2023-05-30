package com.sort;

import com.tentech.ArrayMax;

public class Main extends ArrayMax {

	private void display() {
		System.out.println("Java");
	}
	
	public static void main(String[] abc) {

		Main m = new Main();
		
		m.display();
		
		System.out.println(abc.length);
		
		System.out.println(abc[0]);
		
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		
//		float f = 12.45f;
//		System.out.println(f);
//		
//		double d = f; 
//		System.out.println(d);
		
		double d = 12.449999809265137;
		System.out.println(d);
		
		float f = (float) d;
		System.out.println(f);
		
	}
}
