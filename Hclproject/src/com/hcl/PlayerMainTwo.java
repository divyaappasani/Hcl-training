package com.hcl;

import java.util.Scanner;

public class PlayerMainTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player details");
		String str=sc.nextLine();
		String []words=str.split(",");
		String name=words[0];
		String country=words[1];
		String skill=words[2];
		PlayerTwo p1=new PlayerTwo(name, country, skill);
		System.out.println("Player Details :");
		System.out.println("player Name :"+p1.name);
		System.out.println("Country Name :"+p1.country);
		System.out.println("Skill :"+p1.skill);
		sc.close();
	}

}
