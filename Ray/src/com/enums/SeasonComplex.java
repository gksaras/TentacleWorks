package com.enums;

public enum SeasonComplex {

	WINTER("Low"),
	SPRING("Medium"),
	SUMMER("High"),
	FALL("Medium");	
	
	private final String expectVisitors;
	
	private SeasonComplex(String expectedVisitors) {
		this.expectVisitors = expectedVisitors;
	}
	
	public void printExpectedVistors() {
		System.out.println(expectVisitors);
	}
	
	public static void main(String[] args) {
		
		SeasonComplex s = SeasonComplex.SUMMER;
		System.out.println(s.SPRING);
		
		String string = s.toString();
		System.out.println(string);
	}
}
