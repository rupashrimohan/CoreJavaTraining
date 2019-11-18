package com.inheritance.overriding;

public class TestOverride {

	public static void main(String[] args) {

    Customer pcus=new PreferredCustomer();
    Customer cust=pcus.validateAddress("999");
    
    PreferredCustomer pcust=new CreditcardCustomer();
    PreferredCustomer pc=pcust.creditcardEligibility("85-345-6789");
    
    

	}

}
