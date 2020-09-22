package com.collection.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<TicketBooking> li=new ArrayList<TicketBooking>();
		System.out.println("Enter the number of customers");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
		for(int i=0;i<n;i++){
			String str=br.readLine();
			String[] details=str.split(",");
			String customerName=details[0];	
			int price=Integer.parseInt(details[1]);
			li.add(new TicketBooking(customerName, price));
			}
			TicketBooking t=new TicketBooking();
			t.calculate(li);
			
	}

}
