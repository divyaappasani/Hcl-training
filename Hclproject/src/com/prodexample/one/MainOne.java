package com.prodexample.one;

public class MainOne {

	public static void main(String[] args) {
		ProductOne p1=new ProductOne();
		ProductOne p2=new ProductOne();
		p1.setProduct_code(1);
		p1.setProduct_name("TV");
		p1.setPrice(50000);
		p1.setStock(10);
		p2.setProduct_code(2);
		p2.setProduct_name("Mobile");
		p2.setPrice(20000);
		p2.setStock(20);
		System.out.println("Product Details :");
		System.out.println("Product Code :"+p1.getProduct_code());
		System.out.println("Name :"+p1.getProduct_name());
		System.out.println("Price :"+p1.getPrice());
		System.out.println("Stock :"+p1.getStock());
		System.out.println("\n");
		System.out.println("Product Code :"+p2.getProduct_code());
		System.out.println("Name :"+p2.getProduct_name());
		System.out.println("Price :"+p2.getPrice());
		System.out.println("Stock :"+p2.getStock());
		p1.checkPrice(p1, p2);
		
	}

}
