package com.hcl;

import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the player name");
		String name = sc.nextLine();
		System.out.println("Enter the country name");
		String country = sc.nextLine();
		System.out.println("Enter the skill");
		String skill = sc.nextLine();
		Player p1=new Player(name,country,skill);
		p1.setName(name);
		p1.setCountry(country);
		p1.setSkill(skill);
		System.out.println("Player Details :");
		System.out.println("player Name :"+p1.getName());
		System.out.println("Country Name :"+p1.getCountry());
		System.out.println("Skill :"+p1.getSkill());
	    sc.close();

	}

}
