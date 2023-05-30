package com.passingDataAmongMethods;


public class Main {

	 public static void main(String[] args) {
	        int num = 4;
	        newNumber(num);
	        System.out.print(num); 
	    }

	    public static void newNumber(int num) {
	        num = 8;
	        //System.out.println(num);
	    }
}

// Answer : prints 4