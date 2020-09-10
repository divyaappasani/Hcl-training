package com.exceptions.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] a=new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any 10 values :");
		for(int i=0;i<10;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		TestException t=new TestException();
		t.divide(a);
	}

}
