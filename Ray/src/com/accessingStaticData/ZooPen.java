package com.accessingStaticData;

public class ZooPen {

	 private static final int NUM_BUCKETS = 45;
	  
     public static void main(String[] args) {
         
    	 System.out.println(NUM_BUCKETS);
 
         NUM_BUCKETS = 5; 
         System.out.println(NUM_BUCKETS);
     }
}
