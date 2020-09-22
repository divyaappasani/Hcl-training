package com.collection.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Set<String> hs=new HashSet<>();
		String s;
		while(true){
		System.out.println("Enter the username");
		hs.add(br.readLine());
		System.out.println("Do you want to continue?(y/n)");
		s=br.readLine();
		if(s.equalsIgnoreCase("y"))
			continue;
		else
			break;
		}
		System.out.println("The Unique number of UserNames entered are:"+hs.size());
			}

}
