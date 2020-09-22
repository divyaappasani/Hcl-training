package com.collection.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<String> al=new ArrayList<>();
		String s,name;
		System.out.println("Enter the number of halls:");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Hall Name "+(i+1));
			name=br.readLine();
			al.add(name);
		}
		System.out.println("Enter the hall name to be searched:");
		s=br.readLine();
		if(al.contains(s)) 
			System.out.println(s+" hall is found in the list at position :"+al.indexOf(s));
		else
			System.out.println(s+" hall is not found");
	}

}
