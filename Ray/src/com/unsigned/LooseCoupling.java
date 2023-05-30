package com.unsigned;

interface Travel {
	void go();
}

class Bike implements Travel {
	@Override
	public void go() {
		System.out.println("Bike needs license");
	}
}

class Car implements Travel {
	@Override
	public void go() {
		System.out.println("Petrol cost high");
	}
}

class Bus implements Travel {
	@Override
	public void go() {
		System.out.println("saves Money");
	}
}

class Journey { // Loosely Coupling

	Travel t;

	public Travel getT() {
		return this.t;
	}

	public void setT(Travel t) {
		this.t = t;
	}
	
	public void startJourney() {
		t.go();
	}
	
}

public class LooseCoupling { // does not need any modification

	public static void main(String[] args) {
		
		Journey j = new Journey();
		j.setT(new Bike()); // Bike is dependency Injection
		j.startJourney();
		
		j.setT(new Car());
		j.startJourney();
		
		j.setT(new Bus());
		j.startJourney();
		
	}
}
