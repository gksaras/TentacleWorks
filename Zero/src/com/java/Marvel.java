package com.java;

interface DC {
	
	void define();
	
	default String name(String name) {
		
		define();
		
		production();
	
		return name;
	}
	
	static void production() {
		System.out.println("DC Studios");
	}
	
	private void distributer() {
		System.out.println("Warner Bros");
	}
}

public class Marvel implements DC {
 
	public static void main(String[] args) {
		
		DC dc = new DC() {
			@Override
			public void define() {
				System.out.println("American Franchise & Shared Universe");
			}
		};
		
		System.out.println(dc.name("DC Extended Universe"));
	}
}
