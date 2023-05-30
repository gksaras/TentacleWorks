package com.understandingArrays;

import java.util.Arrays;

public class ArraySample {

	public static void main(String[] args) {
		

	   // int[] numbers = new int[3];
	    
	   // int[] moreNumbers = new int[] {42, 55, 99};
	    
	    int[] moreNumbers = {42, 55, 99}; // Anonymous Array size and type not specified
	    
	    int[] numAnimals; 
	    int [] numAnimals2; 
	    int []numAnimals3; 
	    int numAnimals4[]; 
	    int numAnimals5 [];
	    
	    int[] id, type;
	    int ids[], types;

	    String[] bugs = { "cricket", "beetle", "ladybug" }; 
	    String[] alias = bugs;
	    System.out.println(bugs.equals(alias)); // returns true/false
	    System.out.println(bugs.toString()); 
	    // [L means it is an array 
	    // java.lang.String is the reference type
	    // 160bc7c0 is the hash code.

	    String[] strings = { "stringValue" };
	    System.out.println(strings);
	    
	    Object[] objects = strings;
	    System.out.println(objects);
	    
	    String[] againStrings = (String[]) objects;
	    System.out.println(againStrings);
	   
	   //againStrings[0] = new StringBuilder(); //show error
	    
	    //objects[0] = new StringBuilder(); //gives Exception
	    
	    String[] mammals = {"monkey", "chimp", "donkey"};
	    System.out.println(mammals.length);
	    System.out.println(mammals[0]);
	    System.out.println(mammals[1]);
	    System.out.println(mammals[2]);
	  
	    var birds = new String[6];
	    System.out.println(birds.length);
	    
	    var numbers = new int[10];
	    for (int i = 0; i < numbers.length; i++)
	        numbers[i] = i + 5;
	    System.out.print(Arrays.toString(numbers));
	    System.out.println();

	   // numbers[10] = 3;  // array index out of bound exception
	    
	    
	    // Sorting arrays using Arrays.sort()
	    int[] num = {6, 9, 1};
	    Arrays.sort(num);
	    for (int i = 0; i < num.length; i++)
	        System.out.print(num[i] + " ");

	    System.out.println(Arrays.toString(num));
	    
	    String[] str = {"10", "9", "100"};
	    Arrays.sort(str);
	    for (String s : str)
	        System.out.print(s + " ");
	    
	    // searching
	    int[] numbers2 = {2,4,6,8};
	    System.out.println(Arrays.binarySearch(numbers2, 2)); 
	    System.out.println(Arrays.binarySearch(numbers2, 4)); 
	    System.out.println(Arrays.binarySearch(numbers2, 1)); 
	    System.out.println(Arrays.binarySearch(numbers2, 3)); 
	    System.out.println(Arrays.binarySearch(numbers2, 9)); 
	    
	    // output will not defined because array is not sorted
	    int[] numbers3 = new int[] {3,2,1};
	    System.out.println(Arrays.binarySearch(numbers3, 2));
	    System.out.println(Arrays.binarySearch(numbers3, 3));
	    
	    //compare
	    System.out.println(Arrays.compare(new int[] {1}, new int[] {1,2}));
	    System.out.println(Arrays.compare(new String[] {"a"}, new String[] {"A"}));
	    System.out.println(Arrays.compare(new int[] {1,2,3}, new int[] {1,2}));
	    
	    // using mismatch
	    System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1})); 
	    System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"}));
	    System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1}));
	    
	    
	    // Working with Multi-Dimensional Arrays
	    int[][] vars1;
	    int vars2 [][];
	    int[] vars3[];
	    int[] vars4 [], space [][];
	    
	    String [][] rectangle = new String[3][2];
	    
	    int[][] differentSizes = {{1, 4}, {3}, {9,8,7}};

	    // Jagged Array
	    int [][] args1 = new int[4][];  
	    System.out.println(args1.length);
	  
	    args1[0] = new int[5]; // row = 0 => col = 5
	    args1[1] = new int[3]; // row = 1 => col = 3
	    args1[2] = new int[4]; // row = 2 => col = 4
	    args1[3] = new int[2]; // row = 3 => col = 2 
	    
	    args1[0][1]=2 ;
	    args1[0][2]=3;
	    args1[0][3]=4;
	    args1[0][4]=5;
	    
	    args1[1][0]=6;
	    args1[1][1]=7;
	    args1[1][2]=8;
	    
	    args1[2][0]=9;
	    args1[2][1]=0;
	    args1[2][2]=1;
	    args1[2][3]=2;
	    
	    args1[3][0]=3;
	    args1[3][1]=4;
	
	    
	    for (int i = 0; i < args1.length; i++) {
			for (int j = 0; j < args1[i].length; j++) {
				System.out.print(args1[i][j]+ " ");
			}
			System.out.println();
		}
	    
	    

	    int twoD[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,0,1,2}};
	    System.out.println(twoD.length);
	    
	    for (int i = 0; i < twoD.length; i++) {
	        for (int j = 0; j < twoD[i].length; j++)
	            System.out.print(twoD[i][j] + " ");
	        System.out.println(); 
	    }

	    System.out.println();

	    for (int[] inner : twoD) {
	        for (int n : inner)
	            System.out.print(n + " ");
	        System.out.println();
	    }
	    
	}
}
