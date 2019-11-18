package com.inheritance.overriding;

public class CreditcardCustomer extends PreferredCustomer{

	
	@Override
	protected PreferredCustomer creditcardEligibility(String ssn) {
		// TODO Auto-generated method stub
		PreferredCustomer pc=super.creditcardEligibility(ssn);
		if(pc.valid=="True")
		{
			System.out.println("This customer is Eligible for credit card");
		}
		else
			System.out.println("This customer is not eligible for credit card ");
		
		return pc;
	}
}
