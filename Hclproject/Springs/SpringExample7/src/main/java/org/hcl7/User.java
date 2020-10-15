package org.hcl7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;
	private int age;
	String city;
	Order order;
	public User() {
	}
	public User(String name, int age, String city, Order order) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Order getOrder() {
		return order;
	}
	@Autowired
	@Qualifier("order2")
	public void setOrder(Order order) {
		this.order = order;
	}
	public void display(){
		System.out.println("Name :"+getName());
		System.out.println("age :"+getAge());
		System.out.println("City :"+getCity());
		System.out.println("Order Detail:");
		System.out.println("itemtype:"+order.getItemName());
		System.out.println("Price:"+order.getPrice());
		
	}

}
