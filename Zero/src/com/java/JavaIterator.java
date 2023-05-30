package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Alpha");
		names.add("Beta");
		names.add("Gamma");
		names.add("Marvel");
		names.add("DC");

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String next = it.next();
			if (next.length() <= 5) {
				it.remove();
			}
			System.out.println(next);
		}

	}
}
