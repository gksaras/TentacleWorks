package com.nested;

public class Park {
	
	private int speed = 100;

	static class Ride {
        private int price = 6;
    }

    public static void main(String[] args) {

        var ride = new Ride();
        System.out.println(ride.price);
        
        var p = new Park();
        
        System.out.println(p.speed);
    }
}
