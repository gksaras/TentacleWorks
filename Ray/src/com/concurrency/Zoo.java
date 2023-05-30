package com.concurrency;

public class Zoo {
	
	public static void pause() { // Defines the thread task
		try {
			Thread.sleep(10_000); // Wait for 10 seconds
		} catch (InterruptedException e) {
			
		}
		System.out.println("Thread Finished");
	}

	//Even though the main() method is done, the JVM will wait for the user thread 
	//to be done before ending the program.
	public static void main(String[] args) {
		
		var job = new Thread(()->pause());// Create thread
	
		job.setDaemon(true);// The program will print the first statement and terminate without even printing the second line
		
		job.start();
		// What if we change job to be a daemon thread
		System.out.println("Main method Finished");
	}
}
