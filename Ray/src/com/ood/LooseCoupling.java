  package com.ood;

interface Vehicle {
	public void move();
}

class Car implements Vehicle {
	@Override
	public void move() {
		System.out.println("Car is moving");
	}
}

class GoodTraveler {
	private Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public void startJourney() {
		v.move();
	}
}

class BadTraveler {

	Car c = new Car();

	public void startJourney() {
		c.move();
	}

}

class Bike implements Vehicle {
	@Override
	public void move() {
		System.out.println("Bike is moving");
	}
}

public class LooseCoupling {
	
	public static void main(String[] args) {
	
		// Example of tight coupling - To change journey from Car to Bike, it requires changes in BadTraveler class
		BadTraveler bt = new BadTraveler();
		bt.startJourney();
		
		// Example of loose coupling - To change journey from Car to Bike, it is possible without changing GoodTraveler class
		GoodTraveler gt = new GoodTraveler();
		gt.setV(new Car()); 	// Inject Car dependency
		gt.startJourney(); 		// start journey by Car
		gt.setV(new Bike()); 	// Inject Bike dependency
		gt.startJourney(); 		// Start journey by Bike
	}
}
