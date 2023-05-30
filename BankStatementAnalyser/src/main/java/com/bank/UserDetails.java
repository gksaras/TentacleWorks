package com.bank;

public class UserDetails { 
	
	public String userName;
	public String password;
	public long accNo;
	public String ifsc;
	public long phone;
	public String address;
	
	public UserDetails() {
		this.userName = "joseph";
		this.password = "bankjoseph@123";	
		System.out.println(userName);
		System.out.println(password);
	}
	
	public void accountDetails() {
		this.accNo = 12153862694700218l;
		this.ifsc = "SBI0008927";
		this.phone = 9134721664l;
		this.address = "No.5 Pirates Street,Caribbean Sea,London";
		System.out.println(accNo+"\n"+ifsc+"\n"+phone+"\n"+address);
	}
	
}
