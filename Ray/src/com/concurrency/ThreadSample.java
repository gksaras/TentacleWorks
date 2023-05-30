package com.concurrency;

public class ThreadSample {

	public static void main(String[] args) {
		
		new Thread(() -> System.out.println("Hello")).start();		
		
		System.out.println("World"); // World Hello..... Why not Hello World... We don't know the answer.
		
		// Depending on the thread priority/scheduler, either is possible. 
		
		// IMPORTANT NOTE: Remember that order of thread execution is not often guaranteed.
		
		
		// Complex Example : This example has 4 threads, including main() user thread
		// all threads are executed in asynchronous
		
		 Runnable printInventory = () -> System.out.println("Printing zoo inventory");
	     
		 Runnable printRecords = () -> {
	            for (int i = 0; i < 3; i++)
	                System.out.println("Printing record: " + i);
	        };
	        
	        // using Thread => start()
//	        System.out.println("calling start()");
//	        
//	        System.out.println("begin");
//	        new Thread(printInventory).start();
//	        new Thread(printRecords).start();
//	        new Thread(printInventory).start();
//	        System.out.println("end");
	        
	       // printInventory.run(); // Runnable Interface method => run()
	       // printRecords.run();
	        
	      // Calling run() Instead of start() - each line of code will wait until the run() method is complete before moving on the next line. 
	        System.out.println("calling run()");
//	        
	        System.out.println("begin");
	        new Thread(printInventory).run();
	        new Thread(printRecords).run();
	        new Thread(printInventory).run();
	        System.out.println("end");
	}
}
