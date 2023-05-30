package com.passingDataAmongMethods;

// Returning Objects
public class ZooTickets {

	public static void main(String[] args) {
       
		int tickets = 2;
        
		String guests = "abc";
        
		addTickets(tickets);
        
		guests = addGuests(guests);
        
		System.out.println(tickets + guests); 
    }


    public static int addTickets(int tickets) {
        
    	tickets++;
        
    	return tickets; // 2
    }

    public static String addGuests(String guests) {
        
    	guests += "d";
        
    	return guests;
    }
}

// Answer : prints 2abcd