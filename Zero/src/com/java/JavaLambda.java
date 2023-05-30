package com.java;

//import java.util.ArrayList;
//import java.util.function.Consumer;

interface StringFunction {
	String run(String str);
}

public class JavaLambda {

	public static void main(String[] args) {
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);
	}

	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}
}

//	public static void main(String[] args) {
//		
//		ArrayList<Integer> numbers = new ArrayList<>();
//		
//		numbers.add(10);
//		numbers.add(20);
//		numbers.add(30);
//		numbers.add(40);
//		numbers.add(50);
//		
//		numbers.forEach(
//				(n)-> {
//					System.out.println(n);
//					}
//				);
//		
//		System.out.println();
//		
//		Consumer<Integer> method = (n) -> { System.out.println(n); };
//		numbers.forEach( method );
//		
//	}
