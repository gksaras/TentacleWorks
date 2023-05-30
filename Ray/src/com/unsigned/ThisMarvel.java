package com.unsigned;

// working with this and super keywords

class SuperDc {
	String name = "James Gunn";
	
	void display() {
		System.out.println(name);
	}
}

public class ThisMarvel extends SuperDc{

	String name = "Kevin Feige";
	
	void display() {
		System.out.println(super.name); // parent class
		System.out.println(this.name); // current class
	}
	
	public static void main(String[] args) {
		
		ThisMarvel t = new ThisMarvel();
		t.display();
	}
}
