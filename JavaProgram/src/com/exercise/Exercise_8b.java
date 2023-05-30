package com.exercise;

public class Exercise_8b {
public static void main(String[] args) {
	for (int a= 1; a < 100; a++) {
		for (int b = a+1; b < 100; b++) {
			for (int c = b+1; c < 100; c++) {
				for (int d = 0; d < 100; d++) {
					//a2+b2 =c2+d2
					
					if (a* a+b* b == c* c+d* d) {
						System.out.println(a+"^2+"+ b + "^2= "+ c + "^2 +"+ d + "^2");
					}
				}
			}
			
		}

}

}
}
