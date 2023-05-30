package com.tentech;

public class TwoPointer {

	public static void main(String[] args) {

		String str = "kang dynasty";
		System.out.println(str);

		char[] ch = str.toCharArray();

		int start = 0;
		int end = ch.length - 1;

		while (start < end) {
			char temp = ch[end];
			ch[end] = ch[start];
			ch[start] = temp;
			
			start++;
			end--;
		}
		System.out.println(ch);
	}
}
