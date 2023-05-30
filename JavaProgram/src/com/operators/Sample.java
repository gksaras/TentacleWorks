package com.operators;

class Example{
	
	protected int size;
	 
	protected void swim() {
		
		
	}
	
}


public class Sample extends Example {

	@Override
	 public void swim() {
		
	}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		s.size=12;
		
		
	}
	
}
