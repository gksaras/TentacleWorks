package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("kang", Pattern.CASE_INSENSITIVE);
		
		Matcher m = p.matcher("kang dynasty @ 2026");
		
		boolean find = m.find();
		
		if (find) {
			System.out.println("Match Found");
		}
		else {
			System.out.println("Match Not Found");
		}
	}
}
