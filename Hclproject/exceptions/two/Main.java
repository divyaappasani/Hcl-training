package com.exceptions.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter an integer input :");
			int n = sc.nextInt();
			System.out.println("Entered value is :" + n);
		} catch (InputMismatchException ie) {
			System.out.println(ie);
		} finally {
			sc.close();
		}
	}

}
