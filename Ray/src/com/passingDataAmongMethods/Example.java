package com.passingDataAmongMethods;

public class Example {

    public static void main(String[] args) {
        int alpha = 1;
        int beta = 2;
        
        swap(alpha, beta);
        
        System.out.println(alpha); 
        System.out.println(beta); 
    }

    public static void swap(int a, int b) {
        
    	int temp = a;
        a = b;
        b = temp;
    }
}

// Answer : prints 1,2