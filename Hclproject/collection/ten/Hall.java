package com.collection.ten;

public class Hall implements Comparable<Hall> {
	private String name, contactNumber, ownerName;
	private double costPerDay;

	public Hall() {
	}

	public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		return name + "\t" + contactNumber + "\t" + costPerDay + "\t" + "\t" + ownerName + "\n";
	}

	@Override
	public int compareTo(Hall o) {
		Hall h = o;
		if (this.costPerDay < h.getCostPerDay())
			return -1;
		else if (this.costPerDay > h.getCostPerDay())
			return 1;
		else
			return 0;
	}

}
