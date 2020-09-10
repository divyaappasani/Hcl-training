package com.prodexample.four;


public class ProductFour {
	int product_code,stock;
	String product_name;
	static String name="L & K Suppliers";
	double price;
public ProductFour() {
	
}
public ProductFour(int product_code, int stock, String product_name, double price) {
	super();
	this.product_code = product_code;
	this.stock = stock;
	this.product_name = product_name;
	this.price = price;
}
public int getProduct_code() {
	return product_code;
}
public void setProduct_code(int product_code) {
	this.product_code = product_code;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public static String getName() {
	return name;
}
public static void setName(String name) {
	ProductFour.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public String checkPrice(ProductFour[] objs) {
	ProductFour max=objs[0];
	String s1;
	for(int i=0;i<5;i++) {
		if(objs[i].price>max.price) {
			max=objs[i];
		}
	
	}
	s1=max.product_name;
	return s1;
	
	}
public void getDiscountedPrice() {
	if(price>=80000)
	{
        price=(price * 30)/ 100;
        System.out.println("Discounted price :"+price);

	}
	else if(price>=60000 && price<80000) {
		price=(price * 20)/ 100;
        System.out.println("Discounted price :"+price);
	}
	else if(price>=50000 && price<60000) {
		price=(price * 10)/ 100;
        System.out.println("Discounted price :"+price);
	}
	else {
		price=(price * 5)/ 100;
        System.out.println("Discounted price :"+price);
	}
}
public ProductFour checkLessStock(ProductFour[] objs) {
	
	ProductFour min=objs[0];
	for(int i=0;i<5;i++) {
		if(objs[i].stock<min.stock) {
			min=objs[i];
		}
	
	}
	return min;
	
}


}
