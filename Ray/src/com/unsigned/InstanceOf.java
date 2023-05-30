package com.unsigned;

interface Printable {

}

class A implements Printable {

	public void a_Method() {
		System.out.println("A");
	}
}

class B implements Printable {
	public void b_Method() {
		System.out.println("B");
	}
}

class Call {

	void invoke(Printable p) { // up-casting

		if (p instanceof A) {

			// converting interface object to class object
			A a = (A) p; // down-casting
			a.a_Method();
		}

		if (p instanceof B) {

			// converting interface object to class object
			B b = (B) p; // down-casting
			b.b_Method();
		}
	}
}

//class B extends A {
//	
//}

public class InstanceOf extends A {

	static void display(A a) {

		if (a instanceof InstanceOf) {

			InstanceOf c = (InstanceOf) a; // down-casting
			System.out.println("Downcasting Done");
		}
	}

	public static void main(String[] args) {
		
		
	//	A a = new InstanceOf(); => compilation error
		
	//	InstanceOf in = new A();
		
	//	InstanceOf in = (InstanceOf) new A(); // runtime exception - ClassCast Exception
	//	in.a_Method();
		

		InstanceOf i = new InstanceOf();

		System.out.println(i instanceof InstanceOf); // true

		System.out.println(i instanceof A); // true

		B b = null;
		System.out.println(b instanceof B); // false

//		A a = new A();
//		InstanceOf.display(a);

		A a = new InstanceOf();
		InstanceOf.display(a);

		Printable p;

		p = new B();

		p = new A();

		Call c = new Call();
		c.invoke(p);

	}
}
