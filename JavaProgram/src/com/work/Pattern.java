package com.work;


public class Pattern {
	
	static void numberPattern() {
		
		int k = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(k++ + " " );
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		numberPattern();
		
		// Diamond pattern
		for (int i = 0; i < 5; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = 4; i >= 0; i--) {

			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
