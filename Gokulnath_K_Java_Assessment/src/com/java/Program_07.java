package com.java;

public class Program_07 {
	
	public static void main(String[] args) {

		String strInt = "123";
		String strFloat = "25.34f";
		String strDouble = "34325.526264245d";
		String strLong = "37334793591850817";
		
		Integer i = Integer.valueOf(strInt);
		System.out.println("Integer = "+i);
		
		Float f = Float.valueOf(strFloat);
		System.out.println("Float = "+f);
		
		Double d = Double.valueOf(strDouble);
		System.out.println("Double = "+d);
		
		Long l = Long.valueOf(strLong);
		System.out.println("Long = "+l);
		
	}
}
