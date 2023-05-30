package com.accessingStaticData;

public class Factorial {
	
	
	static void fibonacci() {
		
		int a = 0,b=1;
		System.out.println(a+"\n"+b);
		int c;
		
		for (int i = 2; i <=10; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;	
			
		}
	}

	public static void main(String[] args) {
		 
		fibonacci();
		
		int fact = 1;
		
		for (int i = 1; i <= 5; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
