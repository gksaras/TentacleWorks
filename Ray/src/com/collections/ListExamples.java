package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {

		// creating list with a factory

		String[] array = new String[] { "a", "b", "c" };
		System.out.println(Arrays.toString(array));

		List<String> asList = Arrays.asList(array);
		System.out.println(asList);

		List<String> of = List.of(array);
		System.out.println(of);

		List<String> copyOf = List.copyOf(asList);
		System.out.println(copyOf);

		asList.set(0, "kang");
		asList.set(1, "galactus");
		asList.set(2, "loki");

		// asList.add("thanos"); // java.lang.UnsupportedOperationException
		System.out.println(asList);

		// Creating list with Constructor

		var link1 = new LinkedList<String>();
		var link2 = new LinkedList<String>(link1);

		var list1 = new ArrayList<String>();
		var list2 = new ArrayList<String>(list1);
		var list3 = new ArrayList<String>(10);

		// Using var with ArrayList

		var strings = new ArrayList<String>();
		strings.add("a");
		for (String s : strings) {
			System.out.println(s);
		}

		// Working with List methods
		// add, get, remove, replaceAll, set, sort

		List<String> list = new ArrayList<>();
		list.add("SD");
		list.add(0, "NY"); // [NY]
		list.set(1, "FL"); // [FL]
		System.out.println(list.get(0)); // [NY]
		list.remove("NY"); // [FL]
		list.remove(0); // []
		// list.set(0, "?"); // IndexOutOfBoundsException

		var numbers = Arrays.asList(1, 2, 3);
		System.out.println(numbers);

		numbers.replaceAll(x -> x * 2);
		System.out.println(numbers); // [2, 4, 6]

		// Overloaded remove() method
		var lis = new LinkedList<Integer>();
		lis.add(3); // [3]
		lis.add(2); // [3,2]
		lis.add(1); // [3,2,1]
		lis.remove(2); // removes 1
		lis.remove(Integer.valueOf(2)); // removes 2
		System.out.println(lis);

		// Converting from list to an array

		List<String> li = new ArrayList<>();
		li.add("hawk");
		li.add("robin");
		
		li.forEach(System.out::println);

		Object[] objectArray = li.toArray();

		String[] stringArray = li.toArray(new String[0]);

		li.clear();
		System.out.println(li); // empty list

		System.out.println(objectArray.length); // 2
		System.out.println(stringArray.length); // 2
	}
}
