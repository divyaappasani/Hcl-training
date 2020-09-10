package com.overloadex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainStall {

	public static void main(String[] args) throws IOException {
		String name, detail, ownerName, stallType;
		int size, no;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the stall:");
		name = br.readLine();
		System.out.println("Enter the detail of the stall:");
		detail = br.readLine();
		System.out.println("Enter the owner name of the stall:");
		ownerName = br.readLine();
		Stall s1=new Stall(name, detail, ownerName);
		System.out.println("Enter the type of the stall:");
		stallType = br.readLine();
		System.out.println("Enter the size of the stall in square feet:");
		size = Integer.parseInt(br.readLine());
		System.out.println("Does the hall have TV?(y/n)");
		String choice = br.readLine();
		if(choice.equals("y")) {
			System.out.println("Enter the number of TV:");
			no=Integer.parseInt(br.readLine());
			System.out.println("The cost of the stall is "+s1.computeCost(stallType, size, no));
		}
		else 
			System.out.println("The cost of the stall is "+s1.computeCost(stallType, size));

	}

}
