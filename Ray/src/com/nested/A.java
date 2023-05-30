package com.nested;

public class A {
	private int x = 10;
	
	class B extends A {
		private int x = 20;

		class C extends B{
			private int x = 30;

			public void allTheX() {
				
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(A.this.x);
			}  
			
			public static void main(String[] args) {
				
			}
		}	
		public static void main(String[] args) {
			
		}
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println("Class A => "+a.x);
		
		A.B b = a.new B();
		System.out.println("Class B => "+b.x);
		
		A.B.C c = b.new C();
		System.out.println("Class C => "+c.x);
		
		c.allTheX();
	}
}

