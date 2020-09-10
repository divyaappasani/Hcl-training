package com.exceptions.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] a=new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any 10 values :");
		for(int i=0;i<10;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter Divisor :");
		int divisor=Integer.parseInt(br.readLine());
		TestExceptionTwo t=new TestExceptionTwo();
		t.divide(divisor, a);

	}

}
