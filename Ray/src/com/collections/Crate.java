package com.collections;

class Elephant{
	
}

class Robot{
	
}

public class Crate<T> {

	private T contents;
	
	public T lookInCrate() {
		return contents;
	}
	
	public void packCrate(T contents) {
		this.contents=contents;
	}
	
	public static void main(String[] args) {
	
		Elephant e = new Elephant();
		Crate<Elephant> c = new Crate<>();
		c.packCrate(e);
		
		Robot r = new Robot();
		Crate<Robot> cr = new  Crate<>();
		cr.packCrate(r);
		
	}
}
