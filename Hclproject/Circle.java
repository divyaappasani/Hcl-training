package com.shapes;

public class Circle extends Shape{
 private double radius;
 public Circle() {
	 
 }
 
 
 public Circle(double radius) {
	super();
	this.radius = radius;
}


public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

public void computeArea() {
	 double area=(22/7) * (radius * radius);
	 System.out.println("Area of circle is "+area);
 }
}
