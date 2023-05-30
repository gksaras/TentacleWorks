package com.ood;

class Person{
	private double id;
	private String name;	
	public double getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private void sayHello() {
		System.out.println("Hello -> "+getId());
	}
	public Person() {
		id = Math.random();
		sayHello();
		name = "Java";
	}
}
public class Encapsulation {
	public static void main(String[] args) {		
		Person p = new Person();
		System.out.println(p.getName());
	}
}
