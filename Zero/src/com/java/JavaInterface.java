package com.java;

class Mobiles {
	
	void type() {
		System.out.println("5G");
	}

	void color() {
		System.out.println("Black");
	}
}

interface Laptops {
	
	void model();

	void cost();
}

public class JavaInterface implements Laptops  {

	@Override
	public void model() {
		System.out.println("RedmiBook 5 pro");
	}

	@Override
	public void cost() {
		System.out.println("45,000.00");
	}

	public static void main(String[] args) {

		Laptops l = new JavaInterface();
		l.model();
		l.cost();

		Mobiles m = new Mobiles();
		m.type();
		m.color();
		
//		JavaInterface j = new JavaInterface();
//		j.model();
//		j.cost();
//		
//		j.type();
//		j.color();
	}
}
