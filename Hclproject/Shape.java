package com.shapes;

public class Shape {
	protected double area;
	public Shape() {
		
	}
	public void computeArea() {
		area=0;
	}
	public Shape(double area) {
		super();
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
}
