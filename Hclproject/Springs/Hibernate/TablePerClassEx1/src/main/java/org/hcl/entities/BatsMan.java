package org.hcl.entities;

public class BatsMan extends Person{
	private String battingHand;
	private int highestScore;
	public BatsMan() {
		// TODO Auto-generated constructor stub
	}
	public BatsMan(String battingHand, int highestScore) {
		super();
		this.battingHand = battingHand;
		this.highestScore = highestScore;
	}
	public String getBattingHand() {
		return battingHand;
	}
	public void setBattingHand(String battingHand) {
		this.battingHand = battingHand;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	

}
