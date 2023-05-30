package com.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	
	static void printNames(List names) {
		for (int i = 0; i < names.size(); i++) {
			StringBuilder name = (StringBuilder)names.get(i);
			System.out.println(name);
		}
	}
	
	static void printName(List l) {
		for (int i = 0; i < l.size(); i++) {
			StringBuilder name = (StringBuilder)l.get(i); // ClassCastException
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
			
		List names = new ArrayList ();
		names.add(new StringBuilder("Webby")); 
		names.add(new StringBuilder("Lobby"));
		names.add(new StringBuilder("Bobby"));
		
		printNames(names);
		

		List<String> l = new ArrayList<>(); 
		//l.add(new StringBuilder("Webby")); // does not comiple
		l.add(new String("Fluppy"));
		
		printName(l);
	}
}
