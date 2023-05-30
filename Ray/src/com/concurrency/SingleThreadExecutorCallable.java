package com.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleThreadExecutorCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		var service = Executors.newSingleThreadExecutor();
		
		   try {
	            Future<Integer> result = service.submit(() -> 30 + 11);
	            System.out.println(result.get()); // 41
	            service.shutdown();
		   } finally {
	            service.shutdown();
	       }
	}
}
