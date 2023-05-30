package com.ood;

interface TravelBooking { //This represents TravelBooking interface
	public void bookTicket();
}

class TicketBookingByAgent implements TravelBooking {

	TravelBooking t;

	public TicketBookingByAgent(TravelBooking t) {
		this.t = t;
	}

// Delegation --- Here ticket booking responsibility is delegated to other class using polymorphism (over-ridind methods)
	@Override
	public void bookTicket() {
		t.bookTicket();
	}
}

// TrainBooking IS-A TravelBooking type
class TrainBooking implements TravelBooking {
	@Override
	public void bookTicket() {
		System.out.println("Train ticket booked");
	}
}

// AirBooking IS-A TravelBooking type
class AirBooking implements TravelBooking {
	@Override
	public void bookTicket() {
		System.out.println("Flight ticket booked");
	}
}

public class Delegation {

	public static void main(String[] args) {
		
		TicketBookingByAgent agent = new TicketBookingByAgent(new TrainBooking());
		agent.bookTicket();
		
		agent = new TicketBookingByAgent(new AirBooking());
		agent.bookTicket();	
		
	}
}
