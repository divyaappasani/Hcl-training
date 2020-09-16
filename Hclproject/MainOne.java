package com.strings.one;

import java.io.IOException;
import java.util.Scanner;

public class MainOne {

	public static void main(String[] args) throws IOException {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Humpty's Sentence :");
		String s1,s2;
		s1=s.nextLine();
		System.out.println("Enter Dumpty's Sentence :");
		s2=s.nextLine();
		s1=s1.concat(s2);
		System.out.println("Concatenated String :"+s1);
		s.close();
	}

}
