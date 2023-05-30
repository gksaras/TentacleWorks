package com.workingWithDateAndTimes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Durations {

	public static Duration of(long amount, TemporalUnit unit) {
		return null;
		
	}
    public static Duration ofDays(long days) {
		return null;
    	
    }
    public static Duration ofHours(long hours) {
		return null;
    	
    }
    public static Duration ofMinutes(long minutes) {
		return null;
    	
    }
    public static Duration ofSeconds(long seconds) {
		return null;
    	
    }
    public static Duration ofSeconds(long seconds, long nanoAdjustment) {
		return null;
    	
    }
    public static Duration ofNanos(long nanos) {
		return null;
    	
    }

	
	public static void main(String[] args) {

		var one = LocalTime.of(5, 4, 4);
		var two = LocalTime.of(6, 30);
	    var date = LocalDate.of(2016, 1, 20); 
	    
	    // ChronoUnit for Differences
	   
		/*
		 * System.out.println(ChronoUnit.HOURS.between(one, two));
		 * System.out.println(ChronoUnit.MINUTES.between(one, two));
		 * System.out.println(ChronoUnit.MINUTES.between(one, date));
		 */
	    
	    // Period vs Duration
		/*
		 * var date1 = LocalDate.of(2022, 5, 25); ;;;; var period = Period.ofDays(1);
		 * var days = Duration.ofDays(1);
		 * 
		 * 
		 * System.out.println(date.plus(period)); System.out.println(date.plus(days));
		 */
	    
	    // Working with Instants

//The Instant class represents a specific moment in time in the GMT time zone. Suppose that you want to run a timer:
	    var now = Instant.now();
	    // do something time consuming 
	    var later = Instant.now();

	    var duration = Duration.between(now, later); 
	    System.out.println(duration.toMillis()); 
	    
	    

//If you have a ZonedDateTime, you can turn it into an Instant:

    var date1 = LocalDate.of(2022, 5, 25);
   
    var time1 = LocalTime.of(11, 55, 00);
    
    var zone1 = ZoneId.of("US/Eastern");
    
    var zonedDateTime = ZonedDateTime.of(date1, time1, zone1);
    
    var instant = zonedDateTime.toInstant(); 
    
    System.out.println(zonedDateTime); 
    System.out.println(instant); 
    
    //You cannot convert a LocalDateTime to an Instant. Remember that an Instant is a point in time. A LocalDateTime does not
    //contain a time zone, and it is therefore not universally recognized around the world as the same moment in time.
    

    //    Accounting for Daylight Saving Time
    var date2 = LocalDate.of(2022, Month.MARCH, 13);
    var time2 = LocalTime.of(1, 30);
    var zone2 = ZoneId.of("US/Eastern");
    var dateTime = ZonedDateTime.of(date2, time2, zone2);
    System.out.println(dateTime); 
    System.out.println(dateTime.getHour()); 
    System.out.println(dateTime.getOffset()); 

    dateTime = dateTime.plusHours(1);
    System.out.println(dateTime); 
    System.out.println(dateTime.getHour()); 
    System.out.println(dateTime.getOffset()); 
    
//    Notice that two things change in this example. The time jumps from 1:30 to 3:30. The UTC offset also changes.
    
//  Finally, trying to create a time that doesn’t exist just rolls forward:

        var date3 = LocalDate.of(2022, Month.MARCH, 13);
        var time3 = LocalTime.of(2, 30);
        var zone3 = ZoneId.of("US/Eastern");
        var dateTime1 = ZonedDateTime.of(date3, time3, zone3);
        System.out.println(dateTime1); 

// Java is smart enough to know that there is no 2:30 a.m. that night and switches over to the appropriate GMT offset.

	}

}
