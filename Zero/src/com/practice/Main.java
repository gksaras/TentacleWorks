package com.practice;

public class Main {

	static void test_1() {
		int count = 1;
		while(count <= 15) {
			System.out.print(count%2==0? "*":"+" + "\n");
			count++;
			//System.out.println();
		}
	}
	
	static void test_2() {
		
		String s ="hello";
		
		boolean b = false;
		
		if(b) {
			System.out.println("hello");
			System.out.println("world");
			System.out.println("have a nice day");
			
		} else {
			System.out.println(s + " enjoy");
		}
	
	}
	
	
	
	public static void main(String[] args) {
			test_1();
			test_2();
	}
}
