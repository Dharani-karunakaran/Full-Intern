package com.myproject;

import java.util.Iterator;

public class PhoneBook {
	 String str="";
	
	private String name;
	private String Email;
	private String address;
	private String phoneno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Iterator iterator() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	

}
