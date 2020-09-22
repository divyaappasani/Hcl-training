package com.collection.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainOne {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> al=new ArrayList<>();
		String s;
		while(true){
		System.out.println("Enter the username 1");
		al.add(br.readLine());
		System.out.println("Do you want to continue?(y/n)");
		s=br.readLine();
		if(s.equalsIgnoreCase("y"))
			continue;
		else
			break;
		}
		System.out.println("The Names entered are:");
		for(String i :al) {
			System.out.println(i);
		}
	}

}
