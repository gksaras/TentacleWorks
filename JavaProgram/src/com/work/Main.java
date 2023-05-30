package com.work;

public class Main {

	public final static void main(final String[] args) {

		System.out.println("""
				"ape"
				"baboon"
				"gorilla"
				""");
		int a = 5;
		int b = 2;
		var c = a + (a > 6 ? a++ : b--);
		System.out.println(c);
		System.out.println(b);
		
		var d="12";
		d+=3;
	//	d.reverse();
		System.out.println(d.toString());

		int e = 3;
		System.out.println(~e);
		
		byte by = 127;
		short sh = 32_767;
		int in = 2_147_483_647;
		long l = 9_223_372_036_854_775_807l;
		
		System.out.println(by);
		System.out.println(sh);
		System.out.println(in);
		System.out.println(l);
		
		int bi = 0b1_10_11;
		long li = 0b11_01_01_01_01;
		System.out.println(bi);
		System.out.println(li);
		
		int hi = 0XAF;
		long hl = 0Xfffffffl;
		System.out.println(hi);
		System.out.println(hl);
		
	}
}
