package com.unsigned;

//Java program to illustrate
//delegation
class RealPrinter {
	// the "delegate"
	void print() {
		System.out.println("The Delegate");
	}
}

class Printer {

	// the - delegator
	RealPrinter p = new RealPrinter();

	// create the delegate
	void print() {
		System.out.println("Delegation");
		p.print(); // delegation
	}
}

public class Delegation {

	// To the outside world it looks like Printer actually prints.
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print();
	}
}
