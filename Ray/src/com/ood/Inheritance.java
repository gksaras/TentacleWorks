package com.ood;

// This is parent (also called as super or base) class Animal
class Animal {
	int id;
	String name;

	public Animal() {
		System.out.println("Parent Constructor");
		id = 123;
		name = "'jack'";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sound() {
		System.out.println("By default it is mute");
	}
}

// This is subclass (also called as derived or child or extended) Dog which is extending Animal
class Dog extends Animal {

	public Dog() {
		super();
		System.out.println("Child Constructor");
	}

	// Own behavior
	private void bark() {
		System.out.println(getName() + " Dog " + getId() + " is barking");
	}

	// Overriding super class behavior
	@Override
	public void sound() {
		System.out.println("Barking Continuously....");
		bark();
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Dog dog = new Dog();

		// dog.setId(); // inherited from super class

		dog.sound(); // over-ride behavior of sub class

	}

}
