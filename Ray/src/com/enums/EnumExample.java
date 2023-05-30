package com.enums;

enum Season{
	WINTER,SPRING,SUMMER,FALL
}

public class EnumExample {

	public static void main(String[] args) {
		
		Season s = Season.SUMMER;
		
		switch (s) {
		case WINTER:
			System.out.println("Get out the sled!");
			break;
		case SUMMER:
			System.out.println("Time for the pool");
			break;
		default:
			System.out.println("Is it summer yet!");
			break;
		}
		
		
		var sea = Season.SUMMER;
		System.out.println(sea);
		System.out.println(Season.SUMMER);
		System.out.println(sea == Season.SUMMER); // returns true
		
		for(var season: Season.values()) {			
			System.out.println(season.name() + " " + season.ordinal());		
			}
		
		Season v = Season.valueOf("SUMMER"); // SUMMER
		System.out.println(v);
		
		Season t = Season.valueOf("summer");  // IllegalArgument 
		
	}
}
