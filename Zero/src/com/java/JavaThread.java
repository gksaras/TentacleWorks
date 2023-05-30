package com.java;

public class JavaThread implements Runnable {	
	
	public static int amount = 0;
	
public void run() {
		
		System.out.println("code running in a thread");
	}
	
	
	public static void main(String[] args) {
		
		JavaThread obj = new JavaThread();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("code is running outside the thread");
	}


	

}
