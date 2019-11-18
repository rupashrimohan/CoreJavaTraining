package com.inheritance.overriding;
import java.util.regex.*;
public class PreferredCustomer extends Customer {
private String ssn;
protected String valid;


	public PreferredCustomer() {
		System.out.println("PreferredCustomer Constructor");
	}

	@Override
	public Customer validateAddress(String zipCode) {
		Customer cust = super.validateAddress(zipCode);
		
		if(cust.getZipCode().length() != 5) {
			System.out.println("Customer ZipCode is Incorrect");
		}else {
			System.out.println("Customer has valid ZipCode");
		}
		
		return cust;
	}
	protected PreferredCustomer creditcardEligibility(String ssn)
	{
		PreferredCustomer pc=new PreferredCustomer();
		String ssncheck =ssn;
		int len=ssn.length();
		if(len ==9)
		{
			String regex="^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
			Pattern pattern =Pattern.compile(regex);
			Matcher matcher = pattern.matcher(ssncheck);
			if(matcher.matches()==true)
			{
				valid="True";
			}
		}
		pc.setSsn(ssncheck);
		return pc;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
