package com.shoolmanagement.fee;

public abstract class FeeStructure {
	
	abstract public void tutionFee();//mandatory and fee will be based on class
	
	public void IITFee(){
		System.out.println("Optional Course, Fee will be based on class");
	}
	
	public void cautionDeposit(){
		System.out.println("Every student of this school has to pay this fee of Rs.5000.00");
	}
	
	public void getAllFeeDetails(){
		System.out.println("\n======= FEE DETAILS ========== \n");
		tutionFee();
		IITFee();
		cautionDeposit();
	}
}

