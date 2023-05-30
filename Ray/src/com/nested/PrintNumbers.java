package com.nested;

public class PrintNumbers {

	private int length = 5;

	public void calculate() {
		final int width = 20;
		
		class Calculator { // class inside the method
			public void multiply() {
				System.out.print(length * width);
			}
		}
		
		var calculator = new Calculator();
		calculator.multiply();
	}

	public static void main(String[] args) {
		
		var printer = new PrintNumbers();

		printer.calculate();
}
}
