package com.exceptions.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainItem {

	public static void main(String[] args) throws IOException {
		String name;
		double deposit, costPerDay;
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Item type details:");
		System.out.println("Enter the name:");
		name=br.readLine();
		System.out.println("Enter the deposit:");
		deposit=Double.parseDouble(br.readLine());
		System.out.println("Enter the cost per day:");
		costPerDay=Double.parseDouble(br.readLine());
		ItemType it=new ItemType(name, deposit, costPerDay);
		System.out.println("The details of the item type are:");
		System.out.println(it.toString());
		}
		catch (NumberFormatException ne) {
			System.out.println(ne);
		}
		
	}

}
