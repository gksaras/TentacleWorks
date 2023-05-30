package com.demo;

interface A{
	void display();
}

interface B{
	void display();
}

public class Main implements A,B {

	@Override
	public void display() {
		System.out.println("C");
	}

	public static void main(String[] args) {
		
		Main m = new Main();
		m.display();
	}
}
