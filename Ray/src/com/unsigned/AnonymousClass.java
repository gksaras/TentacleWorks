package com.unsigned;

interface TimeLine {
	void prune();
	void nexusEvent();
}

class Avengers {
	
	void year() {
		System.out.println("2012");
	}
}

class Illumunati extends Avengers { // derived class
	void universeNumber() {
		System.out.println("Earth 838");
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		
		Avengers a = new Avengers() { // Anonymous Class
			
			void year() {
				System.out.println("2025");//over-rides method year in classAvengers
			}
		};
		
		a.year();
		
		Avengers av = new Avengers();
		av.year();
		
		Illumunati i = new Illumunati();
		i.universeNumber();
		//i.year();
		
		TimeLine t = new TimeLine() { // Declaring interface methods anonymously
			
			@Override
			public void prune() {
				System.out.println("Loki 2012");
			}
			
			@Override
			public void nexusEvent() {
				System.out.println("Loki escaped with Tesseract");
			}
		};
		
		t.prune();
		t.nexusEvent();
	}
}
