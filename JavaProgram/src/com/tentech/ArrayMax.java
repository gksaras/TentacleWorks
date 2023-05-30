package com.tentech;

public class ArrayMax {

	public static void main(String[] args) {
		
		int arr[]= {11,25,30,46,87,9};
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
