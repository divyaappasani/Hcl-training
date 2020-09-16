package com.interfacetwo;

import java.util.Scanner;

public class MainFort {

	public static void main(String[] args) {
		System.out.println("What you want to visit" + "\n" + "1.Rajmachi" + "\n" + "2.Shivgadh" + "\n" + "3.Murud");

		Scanner sc = new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1) {
			Fort f1=new Rajmachi();
			f1.distance();
		}
		else if(ch==2) {
			Fort f2=new Shivgadh();
			f2.distance();
		}
		else if(ch==3) {
			Fort f3=new Murud();
			f3.distance();
		}
		else
			System.out.println("Wrong Choice..");
		sc.close();
	}

}
