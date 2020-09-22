package com.collection.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ItemMain {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<ItemType> al=new ArrayList<>();
		String s;
		String name;	
		double deposit,costPerDay;
		int i=1;
		while(true){
		System.out.println("Enter the details of Item Type "+i);
		System.out.println("Name :");
		name=br.readLine();
		System.out.println("Deposit: :");
		deposit=Double.parseDouble(br.readLine());
		System.out.println("Cost per Day:");
		costPerDay=Double.parseDouble(br.readLine());
		al.add(new ItemType(name, deposit, costPerDay));
		System.out.println("Do you want to continue?(y/n)");
		s=br.readLine();
		
		if(s.equalsIgnoreCase("y")) {
			i++;
			continue;
			}
		else
			break;

		}
		System.out.println("The Names entered are:");
		System.out.format("%-20s%-20s%-20s","Name","Deposit","costPerDay");
		System.out.println("\n");
		for(ItemType a :al) {
			System.out.println(a);
		}

	}

}
