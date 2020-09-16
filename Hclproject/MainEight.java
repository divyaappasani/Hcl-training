package com.strings.one;

import java.util.Scanner;

public class MainEight {

	public static void main(String[] args) {

		System.out.println("Enter Humpty's Sentence :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.equals(s.toUpperCase())){
			System.out.println("String is in uppercase");
		}
		else {
			System.out.println("String is not in uppercase");
		}
		sc.close();
	}

}
