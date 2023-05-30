package com.lambdas;

// Functional interface
interface Multiverse{
	
	void dynasty();
	
	default String Universe() {
		return "Earth 616";
	}
}

public class Marvel implements Multiverse{

	public static void main(String[] args) {
	
		// lambda expression
		Multiverse m = ()->System.out.println("kang dynasty");
		m.dynasty();
	}

}
