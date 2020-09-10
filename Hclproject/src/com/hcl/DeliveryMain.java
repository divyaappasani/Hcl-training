package com.hcl;

import java.util.Scanner;

public class DeliveryMain {

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
		Delivery d1=new Delivery(over, ball, runs, nonStriker, batsman, bowler);
		d1.displayDeliveryDetails();
		
		sc.close();

	}

}
