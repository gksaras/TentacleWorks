package com.applyingAccessModifiers;

class FatherDuck{
	
	private String noise = "quack";
	
	private void quack() {
		System.out.println(noise);
	}
}

public class BadDuckling {

	public void makeNoise() {
		 
		var duck = new FatherDuck();
		duck.quack();
		System.out.println(duck.noise);
	}
}
