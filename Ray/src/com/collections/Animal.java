package com.collections;

// Comparable and Comparator both are interfaces and can be used to sort collection elements.

public class Animal implements Comparable<Animal> {

	private int id;
	
	@Override
	public int compareTo(Animal a) {
		return id - a.id;
	}
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.id=123;
		
		Animal a2 = new Animal();
		a2.id=321;
		
		System.out.println(a1.compareTo(a2));
	}
}
