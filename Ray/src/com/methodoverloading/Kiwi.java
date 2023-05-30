package com.methodoverloading;

import java.util.ArrayList;

public class Kiwi {
	
	ArrayList<String> l = new ArrayList<>();

	public static void fly(int numMiles) {}

    public static void fly(Integer numMiles) {}
    
    public static void walk(int ints[]) {

	}
    
    public static void walk(Integer integers[]) {

	}
    
    public static void main(String[] args) {
		
    	fly(12);
    	fly(234);
    	
	}
}
