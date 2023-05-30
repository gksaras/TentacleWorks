package com.java;

//class Book implements Runnable{ // Thread 1	
//
//}

class Number extends Thread { // Thread 2
	
	 public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException { // Main Thraed
		
		Runnable b = ()-> { // Anonymous class using lambda function
			//public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Database Updating...");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		};
		
		Number n = new Number();
		
		Thread t = new Thread(b);
		
		//b.updateDatabase();
		//n.print();
		
//		b.start(); // thread runs separately 
//		n.start(); // it checks for run method to execute the thread
//		
//		b.join(); // wait and execute main thread
//		n.join();
		
		
		t.start();
		
		t.setName("book1");
		System.out.println("Thread Name => "+t.getName());
		
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority => "+t.getPriority());
		
	
		n.start();
	
		if(n.isAlive()){
			System.out.println("Thread Running...");
		}
		
		System.out.println("Ice on my wrist");
	}
}