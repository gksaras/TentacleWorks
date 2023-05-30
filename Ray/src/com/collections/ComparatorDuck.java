package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparing Data with a comparator 
//This code implement Comparable, sometime you want to sort objects in different ways at different times. 
public class ComparatorDuck implements Comparable<ComparatorDuck>{

	 private String name;
	    
	 	private int weight;
	    
	 	//constructor and getters

	    public ComparatorDuck(String name, int weight) {
	    	this.name = name;
	    	this.weight = weight;
		}
	    
	    public int compareTo(ComparatorDuck d) {
	        return name.compareTo(d.name); // sorts ascendingly by name
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public static void main(String[] args) {

	        Comparator<ComparatorDuck> byWeight = new Comparator<>() {

	            public int compare(ComparatorDuck d1, ComparatorDuck d2) {
	                return d1.getWeight() - d2.getWeight();
	            }
	        };

	        var ducks = new ArrayList<ComparatorDuck>();
	        ducks.add(new ComparatorDuck("Quack", 7));
	        ducks.add(new ComparatorDuck("Puddles", 10));
	       
	        Collections.sort(ducks); // sort by name

	       // System.out.println(ducks); // [Puddles, Quack]

	        Collections.sort(ducks, byWeight);

	        //System.out.println(ducks); // [Quack, Puddles]
	    }
}
