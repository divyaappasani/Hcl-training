package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 String name,city;
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the venue name");
			name = sc.nextLine();
			System.out.println("Enter the city name");
		    city = sc.nextLine();
		    Venue v1=new Venue(name, city);
		    v1.setName(name);
		    v1.setCity(city);
			System.out.println("Venue Details :");
			System.out.println("Venue Name :"+v1.getName());
			System.out.println("City Name :"+v1.getCity());
		    sc.close();
		
	}

}
