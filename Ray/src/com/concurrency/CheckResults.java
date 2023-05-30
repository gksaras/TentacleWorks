package com.concurrency;

public class CheckResults {

		private static int counter = 0;

		public static void main(String[] args) {
			
			System.out.println(counter);
			
			new Thread(() -> {
				for (int i = 0; i < 10; i++)
					counter++;
			}).start();
			
			while (counter < 10) {
				System.out.println("Not reached yet");
			}
			System.out.println("Reached: " + counter);
		}
}
