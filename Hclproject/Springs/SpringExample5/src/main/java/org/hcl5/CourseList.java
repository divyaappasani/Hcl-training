package org.hcl5;

import java.util.ArrayList;

public class CourseList {
 private ArrayList<Course> courseList=new ArrayList();

 public void insert(Course course) {
	 courseList.add(course);
 }

 public double revenue()
	{
		double revenue=0.0;
		for(Course course:courseList)
		{
			revenue=course.getFee()*0.2*200;
		}
		return revenue;
	} 
}
