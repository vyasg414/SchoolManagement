package com.shoolmanagement.classes;

import com.shoolmanagement.fee.FeeStructure;
import com.shoolmanagement.subjects.SeventhBooks;
import com.shoolmanagement.subjects.SixthBooks;
import com.shoolmanagement.subjects.Books;

public class ClassStudying {
	private String className;
    private FeeStructure fee;//abstract class
    private Books subjects;//interface - All the subject books specific to the class required to buy
    
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public void getDetials() {
		if(this.className.equalsIgnoreCase("7th")){
			fee = new ClassSeven();
			fee.getAllFeeDetails();
			subjects = new SeventhBooks();
			subjects.getBooksToBuy();
		}
		
		if(this.className.equalsIgnoreCase("6th")){
			fee = new ClassSix();
			fee.getAllFeeDetails();
			subjects = new SixthBooks();
			subjects.getBooksToBuy();
		}
	}
	
	
}
