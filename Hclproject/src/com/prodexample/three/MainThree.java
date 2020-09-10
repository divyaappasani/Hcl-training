package com.prodexample.three;

import java.util.Scanner;

public class MainThree {

	public static void main(String[] args) {
		buildProduct();

	}
	public static void buildProduct() {
		int product_code, stock;
		String product_name;
		double price;
		//String name = "L & K Suppliers";
		ProductThree[] objs=new ProductThree[5];
		for(int i=0;i<5;i++) {

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
		objs[i] = new ProductThree(product_code, stock, product_name, price);
		objs[i].setProduct_code(product_code);
		objs[i].setProduct_name(product_name);
		objs[i].setPrice(price);
		objs[i].setStock(stock);
		}
		System.out.println("Product Details :");
		for(int i=0;i<5;i++) {
		System.out.println("\n");
		System.out.println(ProductThree.getName());
		System.out.println("Product Code :" + objs[i].getProduct_code());
		System.out.println("Name :" + objs[i].getProduct_name());
		System.out.println("Price :" + objs[i].getPrice());
		System.out.println("Stock :" + objs[i].getStock());
		objs[i].getDiscountedPrice();
		System.out.println("\n");
		}
		System.out.println("The product With Min Stock :");
		System.out.println("\n");
		
		ProductThree obj=new ProductThree();
		ProductThree o2=obj.checkLessStock(objs);
		
		System.out.println(ProductThree.getName());
		System.out.println(o2.getProduct_name());
		System.out.println(o2.getStock());
		
	}
}

