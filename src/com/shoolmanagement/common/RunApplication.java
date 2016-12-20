package com.shoolmanagement.common;


import com.shoolmanagement.classes.ClassStudying;
import com.shoolmanagement.student.Student;


public class RunApplication {

	public static void main(String args[]){
		
		Student s = new Student(101,"Kumar","Chandra Shekhar","21-07-2005");
		Student s1 = new Student();
		
		ClassStudying c = new ClassStudying();
		c.setClassName("6th");
		s.setStandard(c);
		
		s.getStudentDetails();
		s.getShoolDetails();
		c.getDetials();
	}
}
