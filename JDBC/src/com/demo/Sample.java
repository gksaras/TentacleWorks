package com.demo;

interface Example{
	
	private void display() { // Java 9
		System.out.println("interface");
	}
	
	default void pave() {
		System.out.println("Java 8");
	}
	
	static void dynasty() {
		System.out.println("static method called using interface name");
	}
}

public class Sample implements Example {

	public static void main(String[] args) {
		
		Example e = new Sample();
		e.pave();		
		
		Example.dynasty(); 
	}
}
