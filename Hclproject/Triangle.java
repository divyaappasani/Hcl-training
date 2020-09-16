package com.shapes;

public class Triangle extends Shape{
	private double base,height;
	public Triangle() {
		
	}
	
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void computeArea() {
		double area= (1/2) * (base * height);
		 System.out.println("Area of Triangle is "+area);
	}


}
