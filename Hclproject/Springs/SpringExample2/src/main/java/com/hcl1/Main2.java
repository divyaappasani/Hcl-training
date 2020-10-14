package com.hcl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		CourseList courselist=new CourseList();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> budgetList=new ArrayList<>();
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
		Course course1=context.getBean("courses1",Course.class);
		Course course2=context.getBean("courses2",Course.class);
		Course course3=context.getBean("courses3",Course.class);
		System.out.println("Enter your Budget ");
		Double budget=Double.parseDouble(br.readLine());
		courselist.insert(course1);
		courselist.insert(course2);
		courselist.insert(course3);
		budgetList=courselist.noOfCourse(budget);
		if(budgetList.isEmpty()) {
			System.out.println("No courses Available");
		}
		else {
			for(String values: budgetList) {
				System.out.println(values);
			}
		}
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
