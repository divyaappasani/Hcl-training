package com.hcl;

public class Delivery {

	public long over, ball, runs;
	public String nonStriker, batsman, bowler;
	public Delivery(long over, long ball, long runs, String nonStriker, String batsman, String bowler) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.nonStriker = nonStriker;
		this.batsman = batsman;
		this.bowler = bowler;
	}	

	public void displayDeliveryDetails() {
		System.out.println("Delivery Details :");
		System.out.println("Over :"+over);
		System.out.println("Ball :"+ball);
		System.out.println("Runs :"+runs);
		System.out.println("Batsman :"+batsman);
		System.out.println("Bowler :"+bowler);
		System.out.println("NonStriker :"+nonStriker);
		
	}
}
