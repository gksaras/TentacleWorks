package com.records;

public class TestRecords {

	public static void main(String[] args) {
		var mommy = new Crane1(4, "Cammy");
		System.out.println(mommy.numberEggs());
		System.out.println(mommy.name());
		
		
		var mommy0 = new Crane(5, "Lammy");
		System.out.println(mommy0.getNumberEggs());
		System.out.println(mommy0.getName());
		
	}
}
