package com.accessingStaticData;

public class ZooInventoryManager {

	private static final String[] treats = new String[10];
    
    public static void main(String[] args) {
        treats[0] = "popcorn";
        treats[1] = "popcorn";
        treats[2] = "popcorn";
        treats[3] = "popcorn";
        treats[4] = "popcorn";
        treats[5] = "popcorn";
        treats[6] = "popcorn";
        treats[7] = "popcorn";
        treats[8] = "popcorn";
        treats[9] = "popcorn";
       // treats[10] = "popcorn";
        
        System.out.println(treats[0]);
        System.out.println(treats[1]);
        System.out.println(treats[2]);
        System.out.println(treats[3]);
        System.out.println(treats[4]);
        System.out.println(treats[5]);
        System.out.println(treats[6]);
        System.out.println(treats[7]);
        System.out.println(treats[8]);
        System.out.println(treats[9]);
       // System.out.println(treats[10]);
        
    }
}
