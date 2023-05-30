package com.typecasting;

public class Exercise {

	public static void main(String[] args) {
		
		int note = (int) (1 * 2 + (long)3);
		System.out.println(note);
		
		short melody = (byte)(double)(note *= 2);
		System.out.println(melody);
		
		double song = melody;
		System.out.println(song);
		
		float symphony = (float)((song == 1_000f) ? song * 2L : song);
		System.out.println(symphony);
		
		
		short height = 1, weight = 3;
		
		// multiplication operator automatically promotes them to int, resulting in an attempt to store an int in a short variable
		short zebra = (byte) (weight*height);
		
		double ox = 1 + height * 2 + weight;
		
		long giraffe = 1 + 9 % height + 1;
		
		System.out.println(zebra);
		System.out.println(ox);
		System.out.println(giraffe);
		
		int ticketsTaken = 1;
		int ticketsSold = 3;
		ticketsSold += 1 + ticketsTaken++; //3+1+1 = 5
		ticketsTaken *= 2; // 2*2 = 4
		ticketsSold += (long)1; // 5+1 = 6
		
		System.out.println(ticketsSold);
		System.out.println(ticketsTaken);

	}
}
