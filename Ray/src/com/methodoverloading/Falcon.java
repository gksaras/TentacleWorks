package com.methodoverloading;

class Hawk {
    public void fly(int numMiles) {
    }

    public static void fly(int numMiles) {
    } 

    public void fly(int numKilometers) {
    } 
}

class Eagle{
	
	public void fly(int numMiles) {
	}

	public int fly(int numMiles) {
		return 1;
	}
}

public class Falcon {

	public void fly(int numMiles) {
	}

	public void fly(short numFeet) {
	}

	public boolean fly() {
		return false;
	}

	void fly(int numMiles, short numFeet) {
	}

	public void fly(short numFeet, int numMiles) throws Exception {
	}

	public static void main(String[] args) {

		Falcon f = new Falcon();
		f.fly(22);
		f.fly();
		f.fly(11);
		f.fly(1, 2);
		f.fly(2, 3);
	}
}
