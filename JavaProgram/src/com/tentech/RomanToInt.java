package com.tentech;

public class RomanToInt {

	static int value(char r) {

		if (r == 'I' || r == 'i')
			return 1;
		if (r == 'V' || r == 'v')
			return 5;
		if (r == 'X' || r == 'x')
			return 10;
		if (r == 'L' || r == 'l')
			return 50;
		if (r == 'C' || r == 'c')
			return 100;
		if (r == 'D' || r == 'd')
			return 500;
		if (r == 'M' || r == 'm')
			return 1000;
		return -1;
	}

	static void convertInt(String s) {

		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			int s1 = value(s.charAt(i));
			if (i + 1 < s.length()) {
				int s2 = value(s.charAt(i + 1));
				if (s1 >= s2)
					total += s1;
				else
					total -= s1;
			} else {
				total += s1;
			}
		}
		System.out.println(total);
	}

	public static void main(String[] args) {

		convertInt("xl");

	}
}
