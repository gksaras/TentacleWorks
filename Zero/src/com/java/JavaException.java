package com.java;

public class JavaException {

	public static void main(String[] args) {

		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		String s = "abc";
		try {
			int parseInt = Integer.parseInt(s);
			System.out.println(parseInt);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Exception Handled");
		}
	}
}
