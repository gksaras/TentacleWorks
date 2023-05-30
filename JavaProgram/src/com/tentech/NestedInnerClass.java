package com.tentech;

class Outer {
	int a = 50;

	class Inner {
		int b = 58;

		void innerDisplay() {
			System.out.println(a);
			System.out.println(b);
		}
	}

	void outerDisplay() {
		// creating object for Inner Class inside Outer Class
		Inner i = new Inner();
		i.innerDisplay();
		System.out.println(i.b);
	}
}

public class NestedInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerDisplay();
		Outer.Inner i = new Outer().new Inner();
		i.innerDisplay();
	}
}
