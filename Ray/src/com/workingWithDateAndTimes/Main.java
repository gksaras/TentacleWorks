package com.workingWithDateAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static LocalDate now() { // 1
		return null;
		
	}

	public static LocalDate of1(int year, int month, int dayOfMonth) { // 2
		
		System.out.println(year+" "+month+" "+dayOfMonth);
		return null;
		
	}
 
	public static LocalDate of(int year, Month month, int dayOfMonth) { // 3
		
		System.out.println(year+" "+month+" "+dayOfMonth);
		return null;
		
	}

	public static LocalTime now1() { // 4
		return null;
		
	}

	public static LocalTime of(int hour, int minute) { // 5
		
		System.out.println(hour+ " "+minute);
		
		return null;
		
	}

	public static LocalTime of(int hour, int minute, int second) { // 6
		
		System.out.println(hour+" "+minute+" "+second);
		return null;
		
	}

	public static LocalTime of(int hour, int minute, int second, int nanos) { // 7
		
		System.out.println(hour+" "+minute+" "+second+" "+nanos);
		return null;
		
	}

	public static LocalDateTime now2() { // 8
		return null;
		
	}

	public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute) { // 9
		
		System.out.println(year+" "+month+" "+dayOfMonth+" "+hour+" "+minute);
		return null;
		
	}

	public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second) { // 10
		
		System.out.println(year+" "+month+" "+dayOfMonth+" "+hour+" "+minute+" "+second);
		return null;
		
	}

	public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond) { // 11
		
		System.out.println(year+" "+month+" "+dayOfMonth+" "+hour+" "+minute+" "+second+" "+nanoOfSecond);
		return null;
		
	}

	public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute) { // 12

		System.out.println(year+" "+month+" "+dayOfMonth+" "+hour+" "+minute);
		return null;
		
	}

	public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second) { // 13
		
		System.out.println(year+" "+month+" "+dayOfMonth+" "+hour+" "+minute+" "+second);
		return null;
		
	}

	public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond) { // 14
		
		System.out.println(year+" "+month+" "+dayOfMonth+" "+hour+" "+minute+" "+second+" "+nanoOfSecond);
		return null;
		
	}

	public static LocalDateTime of(LocalDate date, LocalTime time) { // 15
		
		System.out.println(date+" "+time);
		return null;
		
	}
	 
	public static ZonedDateTime now3() { // 16
		return null;
		
	}
	
	public static ZonedDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos, ZoneId zone) { // 17
		
		System.out.println(year+" "+month+" "+dayOfMonth+" "+hour+" "+minute+" "+second+" "+nanos+" "+zone);
		return null;
		
	}
	
	public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone) { // 18
		
		System.out.println(date+" "+time+" "+zone);
		return null;
		
	}
	
	public static ZonedDateTime of(LocalDateTime dateTime, ZoneId zone) { // 19
		
		System.out.println(dateTime+" "+zone);
		return null;
		
	}
	
	public static void main(String[] args) {
		
		now();
		now1();
		now2();
		now3();
		
		of(1, 2);                   
		
		//of(null, null);
		
		//of(null, null);
		
		of(1, 2, 3);
		
		of(2023, null, 0);
		
		of(null, null, null);
		
		of(1, 20, 30, 400);
		
		of(2023, 04, 28, 2, 5);
		
		of(2023, Month.APRIL, 5, 7, 8);
		
		of(2023, 04, 28, 2, 5, 3);
		
		of(2023, Month.APRIL, 28, 7, 8, 9);
		
		of(2023, 04, 28, 2, 3, 4, 500);
		
		of(2023, Month.APRIL, 28, 5, 4, 2, 1000);
		
		of(2023, 04, 28, 5, 4, 3, 2, null);
		
		of1(2023, 04, 28);
		
		
		
		
	}

}