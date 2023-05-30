package com.passingDataAmongMethods;

public class Gorilla {

	// Autoboxing - convert primitive type to wrapper class
	 int quack = 5;
	 Integer quackquack = Integer.valueOf(quack); 
	 int quackquackquack = quackquack.intValue(); 
	
	 // Unboxing - convert wrapper class into primitive type
		/*
		 * int quack = 5; 
		 * Integer quackquack = quack; 
		 * int quackquackquack = quackquack;
		 */
	    
	    
	    Short tail = 8;
	    Character p = Character.valueOf('p'); 
	    char paw = p; 
	    Boolean nose = true; 
	    Integer e = Integer.valueOf(9);
	    long ears = e;
	    
	    
	    // Limits of autoboxing and numeric promotion
	    Long badGorilla = 8;
	    
	    

	    Character elephant = null;
	    char badElephant = elephant; 
	
	
	
	public void rest(Long x) {
        System.out.print("long"); 
    }
    public static void main(String[] args) { 
        var g = new Gorilla();
        g.rest(8); // should mention l in argument passing
    } 
}
