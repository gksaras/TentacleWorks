package com.workingWithVarArgs;

public class VisitAttractions {

	 // varargs should be specified last in method parameters
	 
	 public void walk1(int... steps) { }
	    
     public void walk2(int start, int... steps) { }
     
    // public void walk3(int... steps, int start) {} 
 
    // public void walk4(int... start, int... steps) {} 
     
     public static void run(int... steps) {
         System.out.print(steps[1]);
     }
     
     public static void main(String[] args) {
		
    	 var v = new VisitAttractions();
    	 	// Pass an array
    	    int[] data = new int[] {1, 2, 3}; 
    	    v.walk1(data);

    	    // Pass a list of values 
    	    v.walk1(1,2,3);

    	    run(11, 77); 
	}
}
