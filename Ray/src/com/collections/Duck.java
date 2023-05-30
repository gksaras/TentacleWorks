package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck> {

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name); // sorts in ascending by name
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        
    	var ducks = new ArrayList<Duck>();
        
    	ducks.add(new Duck("Zebra"));
    	ducks.add(new Duck("Lion"));
    	ducks.add(new Duck("Tiger"));
    	ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        
        Collections.sort(ducks); // sort by name

        System.out.println(ducks); // [Puddles, Quack]
    }
}
