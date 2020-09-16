package com.strings.one;

import java.util.Scanner;

public class MainFive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s,word;
		System.out.println("Enter Humpty's Sentence :");
		s = sc.nextLine();
		System.out.println("Humpty Says :"+s);

		System.out.println("What Dumpty Want To insert & where?");
		word=sc.nextLine();
		System.out.println("Enter Position :");
		int n=sc.nextInt();
		StringBuffer sb=new StringBuffer(s);
		System.out.println("Humpty's New Sentense :"+sb.insert(n-1, word));
		sc.close();
		

	}

}
