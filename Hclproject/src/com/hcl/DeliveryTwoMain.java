package com.hcl;

import java.util.Scanner;

public class DeliveryTwoMain {

	public static void main(String[] args) {

		long over, ball, runs;
		 String nonStriker, batsman, bowler;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the over");
		over=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the balls");
		ball=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the runs");
		runs=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		batsman=sc.nextLine();
		System.out.println("Enter the bowler name");
		bowler=sc.nextLine();
		System.out.println("Enter the nonStriker name");
		nonStriker=sc.nextLine();
		DeliveryTwo d2=new DeliveryTwo(over, ball, runs, batsman, bowler, nonStriker);
		d2.setOver(over);
		d2.setBall(ball);
		d2.setRuns(runs);
		d2.setBatsman(batsman);
		d2.setBowler(bowler);
		d2.setNonStriker(nonStriker);
		System.out.println("Over :"+d2.getOver());
		System.out.println("Ball :"+d2.getBall());
		System.out.println("Runs :"+d2.getRuns());
		System.out.println("Batsman :"+d2.getBatsman());
		System.out.println("Bowler :"+d2.getBowler());
		System.out.println("NonStriker :"+d2.getNonStriker());
		sc.close();
	}

}
