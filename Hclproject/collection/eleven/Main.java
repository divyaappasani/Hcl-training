package com.collection.eleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		TreeSet<Address> al=new TreeSet<Address>();
		System.out.println("Enter the number of Users ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of hall"+(i+1));
			String str=br.readLine();
			al.add(new Address(str));
			String[] details=str.split(",");
			Address ad=new Address(details[0], details[1], details[2], Integer.parseInt(details[3]));
			al.add(ad);	
		}
		System.out.println("Sorted Order (from the least expensive to the most):");
		System.out.printf("%-15s%-15s%-15s%-15s","Name","ContactNumber","Costperday","OwnerName");
		System.out.println("\n");
		System.out.println(al);
	}

}
