package org.hcl4;

import java.util.ArrayList;

public class CourseList {
 private ArrayList<Course> courseList=new ArrayList();

 public void insert(Course course) {
	 courseList.add(course);
 }

 public void discount()
	{
		double max=0;
		double min=9999999;
		String name1=null;
		String name2=null;
		for(Course course:courseList)
			
		{
			if(course.getFee()>max)
			{
				max=course.getFee();
				name1=course.getName();
			}
			else if(course.getFee()<min)
			{
				min=course.getFee();
				name2=course.getName();
			}
		}
		System.out.println("Discount"+"\t"+(0.1*max)+"\t"+"for"+"\t"+name1);
		System.out.println("Discount"+"\t"+(0.05*min)+"\t"+"for"+"\t"+name2);
		
	}
 
}
