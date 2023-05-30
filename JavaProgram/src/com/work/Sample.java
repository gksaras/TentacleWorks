package com.work;

public class Sample {
	int id;
	String name;
	long phone;
		
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	private void method(int n) {
		n=n/10;
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Sample s = new Sample();
		int a=10;
		s.method(a);
		
		s.setId(101);
		s.setName("john");
		s.setPhone(9876543012l);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getPhone());	
		
	}
}
