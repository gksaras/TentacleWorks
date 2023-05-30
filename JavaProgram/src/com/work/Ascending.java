package com.work;

import java.util.Arrays;

public class Ascending {
	public static void main(String[] args) {
		int arr[] = { 9, 5, 6, 7, 8, 4, 3, 2, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
}
