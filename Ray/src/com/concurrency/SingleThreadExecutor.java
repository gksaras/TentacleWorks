package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
	
	public static void main(String[] args) { // main() method independent thread from the ExecutorService

	        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
	      
	        Runnable printRecords = () -> {
	            for (int i = 0; i < 3; i++)
	                System.out.println("Printing record: " + i);
	        };


	        ExecutorService service = Executors.newSingleThreadExecutor(); 
	        // Single-thread executor, tasks are guaranteed to be executed sequentially. 
	        try {
	            System.out.println("begin");
	            service.execute(printInventory);
	            service.execute(printRecords);
	            service.execute(printInventory);
	            System.out.println("end");
	        } 
	        finally {
	            service.shutdown(); // be aware that shutdown() does not stop any tasks that have already been submitted to the thread executor.
	            //If you want to cancel all running and upcoming tasks ? 
	            //ExecutorService provides a method called shutdownNow(), which attempts to stop all running tasks and discards any that not been started yet. 
	        }
	}
}
