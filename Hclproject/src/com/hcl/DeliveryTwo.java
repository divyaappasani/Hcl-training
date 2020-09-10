package com.hcl;

public class DeliveryTwo {

	private long over, ball, runs;
	private String batsman, bowler,nonStriker;
	public DeliveryTwo() 
	{
		
	}

	public DeliveryTwo(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}

	public long getOver() {
		return over;
	}

	public void setOver(long over) {
		this.over = over;
	}

	public long getBall() {
		return ball;
	}

	public void setBall(long ball) {
		this.ball = ball;
	}

	public long getRuns() {
		return runs;
	}

	public void setRuns(long runs) {
		this.runs = runs;
	}

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public String getBowler() {
		return bowler;
	}

	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	public String getNonStriker() {
		return nonStriker;
	}

	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	
}
