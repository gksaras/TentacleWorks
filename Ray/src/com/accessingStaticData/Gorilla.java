package com.accessingStaticData;

public class Gorilla {

	 public static int count;
	    
     public static void addGorilla() {
         count++;
     }
 
     public void babyGorilla() {
         count++;
     }
 
     public void announceBabies() {
         addGorilla();
         babyGorilla();
     }
 
     public static void announceBabiesToEveryone() {
        
    	 addGorilla();
         babyGorilla(); 
     }
 
     public int total;

     public static double average = total / count; 
 
 }
}
