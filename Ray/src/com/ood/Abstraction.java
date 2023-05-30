package com.ood;

abstract class Employee {

	private String name;
	private int payment;

	public Employee(String name, int payment) {
		this.name = name;
		this.payment = payment;
		//System.out.println("abstract class Constructor Employee");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public abstract int calculateSalary();
}

class Contractor extends Employee {

	private int hours;

	public Contractor(String name, int payment, int hours) {
		
		super(name, payment);
		this.hours = hours;
		System.out.println("Contractor");
		
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public int calculateSalary() {
		return getPayment() * hours;
	}
}

class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String name, int payment) {
		super(name, payment);
		System.out.println("FullTime Employee");
	}

	@Override
	public int calculateSalary() {
		return getPayment() * 8;
	}
}

public class Abstraction extends Employee {

	public Abstraction(String name, int payment) {
		super(name, payment);
		System.out.println("Abstraction");
	}

	@Override
	public int calculateSalary() {
		return getPayment() * 5;
	}

	public static void main(String[] args) {

		Abstraction a = new Abstraction("joseph", 5000);

		System.out.println(a.getName());
		System.out.println(a.getPayment());
		System.out.println(a.calculateSalary());
		
		Contractor c = new Contractor("jack", 7000, 12);
		System.out.println(c.getName());
		System.out.println(c.getPayment());
		System.out.println(c.getHours());
		System.out.println(c.calculateSalary());
		
		FullTimeEmployee f = new FullTimeEmployee("john", 15000);
		System.out.println(f.getName());
		System.out.println(f.getPayment());
		System.out.println(f.calculateSalary());
	}
}
