package com.prodexample.three;

public class ProductThree {

	int product_code,stock;
	String product_name;
	static String name="L & K Suppliers";
	double price;
public ProductThree() {
	
}
public ProductThree(int product_code, int stock, String product_name, double price) {
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
	ProductThree.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public void checkPrice(ProductThree obj1,ProductThree obj2) {
	if(obj1.price<obj2.price)
		System.out.println(obj1.product_name+" is cheaper than "+obj2.product_name);
	else if(obj1.price>obj2.price)
		System.out.println(obj2.product_name+" is cheaper than "+obj1.product_name);
	else
		System.out.println(" Both "+obj1.product_name+" and "+obj2.product_name+" has same price");	
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
public ProductThree checkLessStock(ProductThree[] objs) {
	
	ProductThree min=objs[0];
	for(int i=0;i<5;i++) {
		if(objs[i].stock<min.stock) {
			min=objs[i];
		}
	
	}
	return min;
	
}

}
