package com.collections;

import java.util.ArrayList;

class MissingDuck implements Comparable<MissingDuck> {

	private String name ;

	public int compareTo(MissingDuck quack) {

		if (quack == null)
			throw new IllegalArgumentException("Poorly formed duck!");

		if (this.name == null && quack.name == null)
			return 0;

		else if (this.name == null)
			return -1;

		else if (quack.name == null)
			return 1;

		else
			return name.compareTo(quack.name);
	}
}

class LegacyDuck implements Comparable {
    
	private String name;
	

    public int compareTo(Object obj) {
       
    	LegacyDuck d = (LegacyDuck) obj; // cast because no generics
        return name.compareTo(d.name);
    }
}

public class ComparableSample {

	public static void main(String[] args) {
		
	}
}
