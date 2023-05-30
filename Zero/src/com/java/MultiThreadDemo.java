package com.java;

class Table extends Thread {

	// synchronized creates lock mechanism to execute Thread sequentially
	synchronized void printTables(int n) {

		System.out.println(n + "=>Table");

		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadDemo {

	public static void main(String[] args) {

		Table tab = new Table();

		Thread t1 = new Thread() {
			public void run() {
				tab.printTables(5);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				tab.printTables(7);
			}
		};

		t1.start();
		t2.start();

	}
}