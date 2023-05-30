package com.calculatingWithMathAPI;

public class MathSample {

	// Finding Minimum and Maximum
	public static double min(double a, double b) {
		return b;

	}
    public static float min(float a, float b) {
		return b;
    	
    }
    public static int min(int a, int b) {
		return b;
    	
    }
    public static long min(long a, long b) {
		return b;
    	
    }
    
    // Rounding Numbers
    public static long round(double num) {
		return 0;
    	
    }
    public static int round(float num) {
		return 0;
    	
    }
    
    // Determinig the Ceiling and floor
    public static double ceil(double num) {
		return num;
    	
    }
    public static double floor(double num) {
		return num;
    	
    }
    
    // Calculating Components
    public static double pow(double number, double exponent) {
		return exponent;
    	
    }
    
    // Generating Random Numbers
    public static double random() {
		return 0;
    	
    }
    
    public static void main(String[] args) {
		
    	// Finding Minimum and Maximum
    	System.out.println(Math.max(23.4666554, 13.3546436));
    	System.out.println(Math.min(12.4435436534, 11.243432432));
    	
    	// Rounding Numbers
    	System.out.println(Math.round(12.35457658)); // 12 => < .5
    	System.out.println(Math.round(12.5)); // 13 => >= .5
    	int fromFloat = Math.round(123.45f);
    	System.out.println(fromFloat);
    	
    	// Determinig the Ceiling and floor
    	System.out.println(Math.ceil(12.154365363)); // 13
    	System.out.println(Math.floor(12.925657457)); // 12
    	
    	// Calculating Components
    	System.out.println(Math.pow(2, 3));
    	
    	// Generating Random Numbers
    	System.out.println(Math.random()); // prints less than 1 
    	
	}
}
