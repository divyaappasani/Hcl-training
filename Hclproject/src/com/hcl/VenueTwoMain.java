package com.hcl;

import java.util.Scanner;

public class VenueTwoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name, city;
		int choice=0;
		System.out.println("Enter the venue name");
		name = sc.nextLine();
		System.out.println("Enter the city name");
		city = sc.nextLine();
		VenueTwo v1 = new VenueTwo(name, city);
		v1.setName(name);
		v1.setCity(city);
		System.out.println("Venue Details :");
		System.out.println("Venue Name :" + v1.getName());
		System.out.println("City Name :" + v1.getCity());
		while(choice<=3){
		System.out.println("Verify and Update Venue Details ");
		System.out.println("Menu");
		System.out.println("1.Update Venue Name");
		System.out.println("2.Update City Name");
		System.out.println("3.All informations Correct/Exit");
		System.out.println("Type 1 or 2 or 3");
		choice = sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the venue name");
			sc.nextLine();
			name=sc.nextLine();
			v1.setName(name);
			System.out.println("Venue Details :");
			System.out.println("Venue Name :" + v1.getName());
			System.out.println("City Name :" + v1.getCity());
		}
		else if(choice==2) {
			System.out.println("Enter the city name");
			sc.nextLine();
			city = sc.nextLine();
			v1.setCity(city);
			System.out.println("Venue Details :");
			System.out.println("Venue Name :" + v1.getName());
			System.out.println("City Name :" + v1.getCity());
		}
		else if(choice==3){
			System.out.println("Venue Details :");
			System.out.println("Venue Name :" + v1.getName());
			System.out.println("City Name :" + v1.getCity());
		}
		else
			System.out.println("Wrong Choice");
		
		
		}
		sc.close();
	}

}
