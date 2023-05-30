package com.passingDataAmongMethods;

	// passing Objects
public	class Dog {

	    public static void main(String[] args) {
	        String name = "Webby";
	        speak(name);
	        System.out.print(name);
	    }

	    public static void speak(String name) {
	        name = "Georgette";
	    }
	}

// Answer : prints Webby