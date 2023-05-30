package com.workingWithDateAndTimes;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;

public class Sample {

	public static void main(String[] args) {

		// var d = new LocalDate();

		// var d = LocalDate.of(2022, Month.JANUARY, 32);
		// System.out.println(d);

		var date = LocalDate.of(2023, Month.APRIL, 28);
		System.out.println(date);

		date = date.plusDays(2);
		System.out.println(date);

		date = date.plusWeeks(1);
		System.out.println(date);

		date = date.plusMonths(1);
		System.out.println(date);
		
		date = date.plusYears(5);
	    System.out.println(date);

	    var date2 = LocalDate.of(2024, Month.JANUARY, 20);
	    var time = LocalTime.of(5, 15);
	    var dateTime = LocalDateTime.of(date, time)
	        .minusDays(1).minusHours(10).minusSeconds(30);
	    System.out.println(dateTime);

	    var date3 = LocalDate.of(2024, Month.JANUARY, 20);
	    System.out.println(date3);
	    LocalDate plusDays = date.plusDays(10);
	    System.out.println(plusDays);
	    
	    // LocalDate does not contains time
	    //var date4 = LocalDate.of(2024, Month.JANUARY, 20); 
	    //date4 = date4.plusMinutes(1);
	   
	    
	}
}
