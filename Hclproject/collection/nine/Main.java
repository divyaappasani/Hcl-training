package com.collection.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Stall> al=new ArrayList<Stall>();
		System.out.println("Enter the number of stall details");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the stall "+(i+1)+" detail");
			String str=br.readLine();
			String[] details=str.split(",");
			Stall st=new Stall(details[0], details[1], details[2], details[3]);
			al.add(st);
		}
		Iterator<Stall> itr=al.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getName().startsWith("test"))
				itr.remove();
		}
		System.out.printf("%-15s %-20s %-15s %s","Name ","Detail ","Type ","OwnerName");
		System.out.println("\n");
		for(Stall s:al) {
			System.out.printf("%-15s %-20s %-15s %s",s.getName(),s.getDetail(),s.getType(),s.getOwnerName());
			System.out.println("\n");
		}
		


	}

}
