package com.strings.one;

import java.util.Scanner;

public class MainSix {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Humpty's Sentence :");
		String s1,s2,l1[],l2[];
		s1=s.nextLine();
		System.out.println("Enter Dumpty's Sentence :");
		s2=s.nextLine();
		l1=s1.split(" ");
		l2=s2.split(" ");
		if(l1.length >l2.length) {
			System.out.println("Humpty has used more words");
		}
		else if(l1.length <l2.length) {
			System.out.println("Humpty has used more words");
		}
		else
			System.out.println("Both have used equal number of words");
		s.close();
	}

}
