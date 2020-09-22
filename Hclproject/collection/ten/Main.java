package com.collection.ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) throws IOException {
		TreeSet<Hall> al=new TreeSet<Hall>();
		System.out.println("Enter the number of Halls");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of hall"+(i+1));
			String str=br.readLine();
			String[] details=str.split(",");
			Hall h1=new Hall(details[0], details[1], Double.parseDouble(details[2]), details[3]);
			al.add(h1);	
		}
		System.out.println("Sorted Order (from the least expensive to the most):");
		System.out.printf("%-15s%-15s%-15s%-15s","Name","ContactNumber","Costperday","OwnerName");
		System.out.println("\n");
		System.out.println(al);
		
	}

}
