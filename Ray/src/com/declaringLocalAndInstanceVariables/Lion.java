package com.declaringLocalAndInstanceVariables;

public class Lion {
	 int hunger = 4; // Instance variable
     public int feedZooAnimals() {
         int snack = 10; // Local variable
         if (snack > 4) { 
             long dinnerTime = snack++;
             hunger--;
         }   
         return snack;
     }  
     public static void main(String[] args) {
		
    	 var l = new Lion();
    	System.out.println(l.feedZooAnimals());
	}
}

// Answer : prints 11