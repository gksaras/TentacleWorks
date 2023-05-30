package com.declaringLocalAndInstanceVariables;

public class PolarBear {

	final int age = 10; 
    final int fishEaten; // can be declared inside class
    final String name;

    {
        fishEaten = 10; // executes first
        System.out.println(fishEaten);
    }

    public PolarBear() { // executes second
        name = "Robert";
        System.out.println(name);
    }
    
    public static void main(String[] args) {
		var b = new PolarBear();
	}
}
