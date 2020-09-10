package com.hcl;

import java.util.Scanner;

public class ExtraTypeMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the extratype details");
		String str=sc.nextLine();
		String []words=str.split("#");
		String name=words[0];
		long runs=Long.parseLong(words[1]);
		ExtraType et=new ExtraType(name, runs);
		et.setName(name);
		et.setRuns(runs);
		System.out.println("ExtraType Details");
		System.out.println("ExtraType :"+et.getName());
		System.out.println("Runs :"+et.getRuns());
		sc.close();
	}

}
