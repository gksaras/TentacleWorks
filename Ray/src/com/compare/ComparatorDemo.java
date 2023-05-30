package com.compare;

import java.util.Arrays;
import java.util.Comparator;

class StringArray implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		String s1 = (String) o1;
		String s2 = (String) o2;

		int compareTo = s1.compareTo(s2);

		if (compareTo > 0)
			return 1;
		else if (compareTo < 0)
			return -1;
		else
			return 0;
	}

	private void display(String s1, String s2) {

	}
}

public class ComparatorDemo {

	public static void main(String[] args) {

		String arr[] = { "kang", "alpha", "leo" };

		StringArray s = new StringArray();

		Arrays.sort(arr, s);

		System.out.println(Arrays.toString(arr));
	}
}
