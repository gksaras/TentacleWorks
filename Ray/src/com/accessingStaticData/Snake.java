package com.accessingStaticData;

public class Snake {

	final int poison = 100;
	
	public static long hiss = 2;
	
	{
		System.out.println("hello world");
	}
	
	
	static {
		System.out.println("static = "+hiss);
	}

	
	Snake() {
	
//		this.poison=poison;
//		
	boolean venom = true;
		
		if (venom) {
			System.out.print(poison+" ");
			System.out.println("poisonous");
		}
		
		
		System.out.println("java");
	}

	public static void main(String[] args) {
		
		var s = new Snake();

		System.out.println(Snake.hiss);
	}

}
