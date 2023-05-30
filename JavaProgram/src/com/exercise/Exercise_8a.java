package com.exercise;

public class Exercise_8a {
public static void main(String[] args) {
		
		{
		    int less = 100;

		    for (int a = 1; a < less; a++) {
		        for (int b = a + 1; b < less; b++) {
		            for (int c = b + 1; c < less; c++) {
		                if (a * a + b * b == c * c) {
		                    System.out.println(a + "^2+" + b +"^2=" + c +"^2");
		                }
		            }
		        }
		    }
		}

		}
}

