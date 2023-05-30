package com.java;

public class Main extends Thread {

	public static int amount = 0;

	public void run() {
		
		amount++;
		
		//System.out.println("This code is running in a thread");
	}

	public static void main(String[] args) {

		Main thread = new Main();

		thread.start();
		while(thread.isAlive()) {
		
		System.out.println("waiting...");
		
		}
		
		System.out.println(amount);
		
		//System.out.println("This code is outside of thread");

		amount++;
		
		System.out.println(amount);
	}
}
