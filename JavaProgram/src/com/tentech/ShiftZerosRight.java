package com.tentech;

import java.util.Arrays;

public class ShiftZerosRight {

	public static void main(String[] args) {

		int a[] = { 9, 0, 1, 3, 0, 7, 0, 5 };

		int len = a.length;

		for (int i = 0; i < len; i++) {

			for (int j = i; j < len; j++) {

				if (a[j] == 0) {
					int temp = a[j];
					a[j] = a[len - 1];
					a[len - 1] = temp;
				}
			}
			len--;
		}

		System.out.println(Arrays.toString(a));
	}
}
