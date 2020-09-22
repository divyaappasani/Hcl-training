package com.collection.eleven;

public class Address implements Comparable<Address> {
	String username,addressLine1,addressLine2;	
	int pinCode;	
	public Address() {
	}
	public Address(String username, String addressLine1, String addressLine2, int pinCode) {
		super();
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}
	public Address(String str) {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	@Override
	public String toString() {
		return username+"\t"+addressLine1+"\t"+addressLine2+"\t"+pinCode;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public int compareTo(Address o) {
		Address a=o;
		if (this.pinCode < a.getPinCode())
			return -1;
		else if (this.pinCode > a.getPinCode())
			return 1;
		else if(this.pinCode == a.getPinCode())
			return -1;
		else
			return 0;
	}
	
	
}

