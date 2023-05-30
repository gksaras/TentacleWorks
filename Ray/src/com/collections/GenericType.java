package com.collections;

class Elephant {
	
	void weight() {
		System.out.println("5 ton");
	}
}

public class GenericType<T,U> {

	private T contents;
	private U sizeLimit;
	
	public GenericType(T contents, U sizeLimit){
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}
	
	public static void main(String[] args) {
		
		Elephant e = new Elephant();
		//e.weight();
		
		Integer n = 15_000;
		
		GenericType<Elephant, Integer> g = new GenericType<>(e,n);
	
		System.out.println(g.sizeLimit);
		
	}
}
