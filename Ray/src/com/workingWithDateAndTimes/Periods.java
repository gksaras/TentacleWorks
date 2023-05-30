package com.workingWithDateAndTimes;

import java.time.Period;

// working with periods
public class Periods {

	public static Period of(int years, int months, int days) {
		
		//System.out.println(years+" "+months+" "+days);
		return null;
		
	}

	public static Period ofDays(int days) {
		
		//System.out.println(days);
		return null;
		
	}

	public static Period ofWeeks(int weeks) {

		//System.out.println(weeks);
		return null;
		
	}

	public static Period ofMonths(int months) {
		
		System.out.println(months);
		return null;
		
	}

	public static Period ofYears(int years) {
		
		//System.out.println(years);
		return null;
		
	}

	public static void main(String[] args) {

		var annually = Period.ofYears(1);
		System.out.println(annually);
		
		var quarterly = Period.ofMonths(3);
		System.out.println(quarterly);
		
		var everyThreeWeeks = Period.ofWeeks(3);
		System.out.println(everyThreeWeeks);
		
		var everyOtherDay = Period.ofDays(2);
		System.out.println(everyOtherDay);
		
		var everyYearAndAWeek = Period.of(1, 0, 7);
		System.out.println(everyYearAndAWeek);
		
		//There’s one catch. You cannot chain methods when creating a Period.

	    //var wrong = Period.ofYears(1).ofWeeks(1); 

	    // This tricky code is really like writing the following:
	    var wrong = Period.ofYears(1);
	    System.out.println(wrong);
	    
	    //wrong = Period.ofWeeks(1); does not prints
	    //System.out.println(wrong);
	    
	}
}
