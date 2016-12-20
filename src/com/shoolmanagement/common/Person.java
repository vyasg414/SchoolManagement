package com.shoolmanagement.common;

public class Person {
	
	private String name;
	private String father;
	private String dateOfBirth;
	
	public Person(){
		name="";
		father="";
		dateOfBirth="";
	}
	
	//"Kumar","Chandra Shekhar","21-07-2005"
	public Person(String name, String father, String dateOfBirth){
		this.name=name;
		this.father=father;
		this.dateOfBirth=dateOfBirth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
