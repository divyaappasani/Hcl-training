package com.prodexample.two;

import java.util.Scanner;

public class MainTwo {

	public static void main(String[] args) {
		buildProduct();
	}

	public static void buildProduct() {
		int product_code, stock;
		String product_name;
		double price;
		String name = "L & K Suppliers";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Code");
		product_code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Name");
		product_name = sc.nextLine();
		System.out.println("Enter Price");
		price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Stock");
		stock = sc.nextInt();
		sc.nextLine();
		Product p1 = new Product(product_code, stock, product_name, price);
		p1.setProduct_code(product_code);
		p1.setProduct_name(product_name);
		p1.setPrice(price);
		p1.setStock(stock);
		System.out.println("Enter Product Code");
		product_code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Name");
		product_name = sc.nextLine();
		System.out.println("Enter Price");
		price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Stock");
		stock = sc.nextInt();
		sc.nextLine();
		Product p2 = new Product(product_code, stock, product_name, price);
		p2.setProduct_code(product_code);
		p2.setProduct_name(product_name);
		p2.setPrice(price);
		p2.setStock(stock);
		System.out.println("Product Details :");
		System.out.println("\n");
		System.out.println(name);
		System.out.println("Product Code :" + p1.getProduct_code());
		System.out.println("Name :" + p1.getProduct_name());
		System.out.println("Price :" + p1.getPrice());
		System.out.println("Stock :" + p1.getStock());
		p1.getDiscountedPrice();
		System.out.println("\n");
		System.out.println(name);
		System.out.println("Product Code :" + p2.getProduct_code());
		System.out.println("Name :" + p2.getProduct_name());
		System.out.println("Price :" + p2.getPrice());
		System.out.println("Stock :" + p2.getStock());
		p2.getDiscountedPrice();
		System.out.println("\n");
		p1.checkPrice(p1, p2);
		sc.close();

	}
}
