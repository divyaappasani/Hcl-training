package com.collection.seven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketBooking{
	private String customerName;	
	private Integer price;
	
public TicketBooking() {
}

public TicketBooking(String customerName, Integer price) {
	super();
	this.customerName = customerName;
	this.price = price;
}

public String getCustomerName() {
	return customerName;
}

@Override
public String toString() {
	return String.format("customerName= %s, price= %s", customerName, price);
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}
public void calculate(List<TicketBooking> li) {
	ArrayList<Integer> t1=new ArrayList<Integer>();
	for(TicketBooking t :li) {
		t1.add(t.getPrice());}
	int min=t1.indexOf(Collections.min(t1));
	int max=t1.indexOf(Collections.max(t1));
	System.out.println("The minimum amount Ticket is brought by "+li.get(min).toString());
	System.out.println("The maximum amount Ticket is brought by "+li.get(max).toString());
	
}

}
