package com.ood;

// This represents payment interface
interface Payment {
	public void pay();
}

// Cash IS-A Payment type
class CashPayment implements Payment {

	// method overriding
	@Override
	public void pay() {
		System.out.println("This is cash payment");
	}

	// method overloading
	public void pay(int x) {
		System.out.println("This is cash payment" + x);
	}

}

// Credit-card IS-A Payment type
class CreditPayment implements Payment {

	// method overriding
	@Override
	public void pay() {
		System.out.println("This is credit card payment");
	}
	
	void cash() {
		System.out.println("25,000");
	}

}

public class PolymorphismTest implements Payment{

	@Override
	public void pay() {
		System.out.println("Rupay Card");
	}
	
	public static void main(String[] args) {
		
		Payment p = new PolymorphismTest();
		p.pay();
		
		p = new CashPayment();
		p.pay();
		
		p=new CreditPayment();
		p.pay();
		
// to achieve method overloading or accessing class methods you should create instance for specific class
		
	}
}
