package com.shoolmanagement.activities;

abstract public class FacultyActivities {
	
	abstract public void joinSkillDevelopmentTraining();//this is mandatory for faculties
	abstract public void joinComputerTraining();//this is mandatory for faculties
	
	public void joinWorkShop(){//Optional
		System.out.println("Joining WorkShop team is an optioanl");
	}
	
	public void joinInterviewPannel(){//Optional
		System.out.println("Joining in interview pannel is an optioanl");
	}
}
