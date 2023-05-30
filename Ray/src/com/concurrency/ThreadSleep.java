package com.concurrency;

public class ThreadSleep {
	
	private static int counter = 0;

	public static void main(String[] a) {
		new Thread(() -> {
			for (int i = 0; i < 10; i++)
				counter++;
		}).start();
		
		while (counter < 10) {
			System.out.println("Not reached yet");
			try {
				Thread.sleep(1000); // 1 SECOND
				System.out.println("Interrupted!");
			} catch (InterruptedException e) {
				System.out.println("Interrupted!");
			}
		}
		
		System.out.println("Reached: " + counter);
	}
}
