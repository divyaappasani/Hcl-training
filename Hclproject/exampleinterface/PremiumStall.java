package com.exampleinterface;

public class PremiumStall implements Stall{
	private String stallName,ownerName;
	private int cost,projector;
	public PremiumStall() {
	}
	@Override
	public void display() {
		System.out.println("Stall Name:"+stallName);
		System.out.println("Cost:"+cost);
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Number of Projectors:"+projector);
	}
	public PremiumStall(String stallName,int cost, String ownerName, int projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	
	

}
