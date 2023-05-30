package com.passingDataAmongMethods;

public class Sample {

	   public static void main(String[] args) {
	        var name = new StringBuilder("Webby");
	        speak(name);
	        System.out.print(name); 
	    }

	    public static void speak(StringBuilder s) {
	        s.append("Georgette");
	    }
}

// Answer : WebbyGeorgette
