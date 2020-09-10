package com.exampleinterface;

public class GoldStall implements Stall{
	private String stallName,ownerName;
	private int cost,tvSet;
	public GoldStall() {
		
	}
	public GoldStall(String stallName,int cost,String ownerName, int tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
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
	public int getTvSet() {
		return tvSet;
	}
	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}
	@Override
	public void display() {
		System.out.println("Stall Name:"+stallName);
		System.out.println("Cost:"+cost);
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Number of TV sets:"+tvSet);
	}
	

}
