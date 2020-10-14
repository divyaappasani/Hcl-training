package com.hcl1;

import java.util.ArrayList;

public class CourseList {
 private ArrayList<Course> courseList=new ArrayList();

 public void insert(Course course) {
	 courseList.add(course);
 }
 public ArrayList<String> noOfCourse(Double budget){
	 ArrayList<String> list=new ArrayList<>();
	 for(Course course:courseList) {
		 if(budget>=course.getFee()) {
			 list.add(course.getName()+"-"+(int)(budget/course.getFee()));
		 }
	 }
	 return list;
 }
 
}
