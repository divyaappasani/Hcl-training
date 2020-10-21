package org.hcl.entities;

public class Bowler extends Person{
	private String bowlingHand;
	private int wickets;
	public Bowler() {
		// TODO Auto-generated constructor stub
	}
	public Bowler(String bowlingHand, int wickets) {
		super();
		this.bowlingHand = bowlingHand;
		this.wickets = wickets;
	}
	public String getBowlingHand() {
		return bowlingHand;
	}
	public void setBowlingHand(String bowlingHand) {
		this.bowlingHand = bowlingHand;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

}
