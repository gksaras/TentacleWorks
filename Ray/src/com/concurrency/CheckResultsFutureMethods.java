package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResultsFutureMethods {

	private static int count = 0;
	
	public static void main(String[] args) throws Exception {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		try {
			Future<?> result = service.submit(() -> {
				for (int i = 0; i < 10_000; i++) {
					count++;
				}
			});
			result.get(10, TimeUnit.SECONDS);// Returns null for Runnable, TimeUnit is optional value and enum type.
			System.out.println("Reached");
		} 
		catch (TimeoutException e) {
			System.out.println("not reached");
		} finally {
			service.shutdown();
		}	
	}
}
