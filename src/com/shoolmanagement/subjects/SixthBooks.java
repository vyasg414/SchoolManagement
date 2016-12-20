package com.shoolmanagement.subjects;

public class SixthBooks implements Books{
	
	public void buyTeluguBook(){
		System.out.println("Buy 6th class Telugu Book");
	}
	public void buyEnglishBook(){
		System.out.println("Buy 6th class English Book");
	}
	public void buyHindiBook(){
		System.out.println("Buy 6th class Hindi Book");
	}
	public void buyMathsBook(){
		System.out.println("Buy 6th class Maths Book");
	}
	public void buyScienceBook(){
		System.out.println("Buy 6th class Science Book");
	}
	public void buySocialBook(){
		System.out.println("Buy 6th class Social Book");
	}
	
	public void getBooksToBuy(){
		System.out.println("\n======= SUBJECT DETAILS ========== \n");
		buyTeluguBook();
		buyEnglishBook();
		buyHindiBook();
		buyMathsBook();
		buyScienceBook();
		buySocialBook();
	}
}
