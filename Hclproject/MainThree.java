package com.strings.one;

import java.util.Scanner;

public class MainThree {

	public static void main(String[] args) {

		System.out.println("Enter Humpty's Sentence :");
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s = sc.nextLine();
		System.out.println("Word To Replace :");
		String a = sc.nextLine();
		System.out.println("Synonym :");
		String b = sc.nextLine();
		String str = s.replace(a, b);

		System.out.println("Replaced String :" + str);
		sc.close();
	}

}
