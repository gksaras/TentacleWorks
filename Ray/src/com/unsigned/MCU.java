package com.unsigned;

import java.time.LocalDate;

public class MCU {

	int phase;
	String movie;
	LocalDate year;
	
	public void detail(int p1,String p2,LocalDate p3) {
		this.phase=p1;
		this.movie=p2;
		this.year=p3;
	}
	
	void display() {
		System.out.println("PHASE => "+phase);
		System.out.println("MOVIE => "+movie);
		System.out.println("YEAR  => "+year);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		MCU m1 = new MCU();
		m1.detail(1, "The Avengers",LocalDate.of(2012, 04, 27));
		m1.display();
		
		MCU m2 = new MCU();
		m2.detail(2, "Avengers - Age of Ultron",LocalDate.of(2015, 04, 24));
		m2.display();
		
		MCU m3 = new MCU();
		m3.detail(3, "Avengers - Infinity War",LocalDate.of(2018, 04, 27));
		m3.display();
		
		MCU m4 = new MCU();
		m4.detail(3, "Avengers - Endgame",LocalDate.of(2019, 04, 26));
		m4.display();
		
		MCU m5 = new MCU();
		m5.detail(6, "Avengers - The Kang Dynasty",LocalDate.of(2025, 05, 02));
		m5.display();
		
		MCU m6 = new MCU();
		m6.detail(6, "Avengers - Secret Wars",LocalDate.of(2026, 05, 01));
		m6.display();
	}
}
