package com.shoolmanagement.student;

import com.shoolmanagement.classes.ClassStudying;
import com.shoolmanagement.common.SchoolInfo;
import com.shoolmanagement.common.Person;

public class Student extends Person implements SchoolInfo{
	int adminNo;
	ClassStudying standard;
	 
	public Student(){
		super();
		adminNo=0;
	}
	
	//101,"Kumar","Chandra Shekhar","21-07-2005"
	public Student(int adminNo, String name, String father, String dateOfBirth){
		super(name,father,dateOfBirth);//Person parameterized constructor will be called with "Kumar","Chandra Shekhar","21-07-2005"
		this.adminNo = adminNo;
	}
	
	public int getAdminNo() {
		return adminNo;
	}
	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}
	public ClassStudying getStandard() {
		return standard;
	}
	public void setStandard(ClassStudying standard) {
		this.standard = standard;
	}
	
	public void getStudentDetails() {
		System.out.println("\n======= STUDENT DETAILS ========== \n");
		System.out.println("Admission No:"+getAdminNo());
		System.out.println("Name:"+super.getName());
		System.out.println("Father Name:"+super.getFather());
		System.out.println("Date of Birth:"+super.getDateOfBirth());
		System.out.println("Class Studying:"+standard.getClassName());
	}
	
	public void getShoolDetails() {
		System.out.println("\n======= SCHOOL DETAILS ========== \n");
		System.out.println("School Name:"+SchoolInfo.schoolName);
		System.out.println("School Address:"+SchoolInfo.schoolAddress);
		
	}
	
}
