package com.strings.one;

import java.util.Scanner;

public class MainFour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s,word;
		System.out.println("Enter Dumpty's Sentence :");
		s = sc.nextLine();
		System.out.println("Dumpty Says :"+s);

		System.out.println("What Humpty Want To Remove?");
		word=sc.nextLine();
		s=s.replaceAll(word," ");
		System.out.println("Dumpty's New Sentense :"+s);
		sc.close();
	}

}
