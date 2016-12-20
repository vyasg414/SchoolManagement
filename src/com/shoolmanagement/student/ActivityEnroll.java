package com.shoolmanagement.student;

import com.shoolmanagement.activities.StudentActivities;

public class ActivityEnroll extends StudentActivities{
	
	Student student;
	
	public ActivityEnroll(Student student){
		super("Chess", "", "");
		this.student = student;
		joinChess();
	}
	public ActivityEnroll(Student student, String option1, String option2, String option3){
		super("Chess", option2, option3);
		this.student = student;
		joinChess();
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void joinChess(){
		System.out.println(student.getName()+" enrolled in chess as it is mandatory");
	}
	
	public void joinKarate(){
		System.out.println(student.getName()+ " enrolled in Karate with own interest");
	}
	
	public void joinDance(){
		System.out.println(student.getName()+" enrolled in Dance with own interest");
	}
	
	public void enrollActivities(){
				
		if(super.getOption1().equalsIgnoreCase("Karate")){
			joinKarate();
		}
		
		if(super.getOption1().equalsIgnoreCase("Dance")){
			joinDance();
		}
	}

	
	
}
