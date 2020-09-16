package com.shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainShape {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch;
		System.out.println("Enter the shape" + "\n" + "1.Circle" + "\n" + "2.Rectangle" + "\n" + "3.Triangle");
		ch = Integer.parseInt(br.readLine());
		if (ch == 1) {
			System.out.println("Enter the radius:");
			double radius = Double.parseDouble(br.readLine());
			Circle s1 = new Circle(radius);
			s1.computeArea();
		} else if (ch == 2) {
			System.out.println("Enter the length and breadth:");
			double length, breadth;

			length = Double.parseDouble(br.readLine());
			breadth = Double.parseDouble(br.readLine());
			Shape s1 = new Rectangle(length, breadth);
			s1.computeArea();
		} else if (ch == 3) {
			System.out.println("Enter the base and height:");
			double base, height;
			base = Double.parseDouble(br.readLine());
			height = Double.parseDouble(br.readLine());
			Shape s1 = new Triangle(base, height);
			s1.computeArea();
		} else
			System.out.println("invalid choice");

	}

}
