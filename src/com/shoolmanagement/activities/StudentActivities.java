package com.shoolmanagement.activities;

abstract public class StudentActivities {
	
	private String option1;
	private String option2;
	private String option3;
	
	public StudentActivities(String option1, String option2, String option3){
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
	}
	
	abstract public void joinChess(); //mandatory
	
	public void joinKarate(){
		System.out.println("Karate is optional");
	}
	
	public void joinDance(){
		System.out.println("Dance is optional");
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	
}
