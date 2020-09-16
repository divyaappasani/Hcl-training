package com.strings.one;

import java.util.Scanner;

public class MainSeven {

	public static void main(String[] args) {

		System.out.println("Enter Humpty's Sentence :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Converted String :"+s.toUpperCase());
		sc.close();
	}

}
