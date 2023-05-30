package com.assess;

// Converting String into integer,long,float or double
public class Exercise_7 {

	public static void main(String[] args) {
		
		String strInt="2023";
		String strFloat="23.567F";
		String strLong="9876543012L";
		String strDouble="15.3420789651D";
		
		Integer valueOfInt = Integer.valueOf(strInt);	
		int parseInt = Integer.parseInt(strInt);
		
		System.out.println(valueOfInt);
		System.out.println(parseInt);
		
		Float valueOfFloat = Float.valueOf(strFloat);
		float parseFloat = Float.parseFloat(strFloat);
		
		System.out.println(valueOfFloat);
		System.out.println(parseFloat);
		
		Long valueOfLong = Long.valueOf(strLong);
		long parseLong = Long.parseLong(strLong);
		
		System.out.println(valueOfLong);
		System.out.println(parseLong);
		
		Double valueOfDouble = Double.valueOf(strDouble);
		double parseDouble = Double.parseDouble(strDouble);
		
		System.out.println(valueOfDouble);
		System.out.println(parseDouble);
		
		
		
	}
}
