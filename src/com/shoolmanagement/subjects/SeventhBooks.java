package com.shoolmanagement.subjects;

public class SeventhBooks implements Books{
	
	public void buyTeluguBook(){
		System.out.println("Buy 7th class Telugu Book");
	}
	
	public void buyEnglishBook(){
		System.out.println("Buy 7th class English Book");
	}
	public void buyHindiBook(){
		System.out.println("Buy 7th class Hindi Book");
	}
	public void buyMathsBook(){
		System.out.println("Buy 7th class Maths Book");
	}
	public void buyScienceBook(){
		System.out.println("Buy 7th class Science Book");
	}
	public void buySocialBook(){
		System.out.println("Buy 7th class Social Book");
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
