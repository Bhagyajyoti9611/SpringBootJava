package com.gentech.demo;

public class Customer {
	
	private String customerName;
	private String location;
	private long contactNo;
	
	public Customer() {
		
	}
	public Customer(String customerName, String location, long contactNo) {
		super();
		this.customerName = customerName;
		this.location = location;
		this.contactNo = contactNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
}
