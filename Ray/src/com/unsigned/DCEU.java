package com.unsigned;

interface DCStudio {
	 void produce();
}

class SynderCut {
	public void specialPresentation() {
		System.out.println("Justice League extended version");
	}	
}

class WarnerBros implements DCStudio {	
	@Override
	public void produce() {
		System.out.println("Produced by DC Studios");
	}
	public void distribute() {
		System.out.println("Distributed by Warner Bros.Pictures");
	}
}

public class DCEU extends WarnerBros { // Is A RelationShip
	
	static SynderCut s; // HAS A RelationShip

	static DCEU d;
	
	String name;
	
	public DCEU() {
		name="Detective Comic Extended Universe";
		System.out.println(this.name);	
	}
	
	private void display() {
		System.out.println("American Media Franchise and Shared Universe");
	}
	
	public static void main(String[] args) {
		
		d = new DCEU();
		d.display();
		d.produce();
		d.distribute();
		
		s = new SynderCut(); 
		s.specialPresentation();
	}
}
