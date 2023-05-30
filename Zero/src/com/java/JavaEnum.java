package com.java;

enum Level {
	low, medium, high
}

public class JavaEnum {

	public static void main(String[] args) {

		Level l = Level.medium;

		switch (l) {
		case low:
			System.out.println("Low Level");
			break;
		case medium:
			System.out.println("Medium Level");
			break;
		case high:
			System.out.println("High Level");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + l);
		}
	}
}
