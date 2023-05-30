package com.functionalInterface;

public class Tiger implements Sprint,Dance{

	@Override
	public void sprint(int speed) {
		
		System.out.println(speed);
	}
	
	@Override
	public void move() {
		System.out.println("move");
	}
	
	@Override
	public void rest() {
		System.out.println("rest");
	}
}
