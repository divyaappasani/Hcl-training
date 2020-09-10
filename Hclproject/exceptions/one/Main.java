package com.exceptions.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int cost;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the cost of the item for n days");
			cost = Integer.parseInt(br.readLine());
			System.out.println("Enter the value of n");
			int n = Integer.parseInt(br.readLine());
			double d = cost / n;
			System.out.println("Cost per day of the item is :" + d);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		}

	}

}
