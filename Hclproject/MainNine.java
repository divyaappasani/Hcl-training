package com.strings.one;

import java.util.Scanner;

public class MainNine {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Humpty's Sentence :");
		String s1,s2;
		s1=s.nextLine();
		System.out.println("Enter Dumpty's Sentence :");
		s2=s.nextLine();
		if(s1.contains(s2)) {
			System.out.println("Found");
		}
		else System.out.println("Not Found");
		s.close();
	}

}
