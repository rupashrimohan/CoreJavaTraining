package com.inheritance.overriding;

public class Customer {
	private String firstName;
	private String address;
	private String zipCode;
	private boolean validAddress = false;
	
	public Customer() {
		System.out.println("Customer Constructor");
	}
	
	public String checkZip(String zip)
	{
		String zipcode = zip;
		int len=zip.length();
		switch(len)
		{
		case 1:
			zipcode="0000"+zip;
			return zipcode;
			
		case 2:
			zipcode="0000"+zip;
			return zipcode;
		case 3:
			zipcode="0000"+zip;
			return zipcode;
		case 4:
			zipcode="0000"+zip;
			return zipcode;
			
		case 5:
			zipcode="0000"+zip;
			return zipcode;
				default:
					return zipcode;
		}
	}
	protected Customer validateAddress(String zipcode) {
		Customer cust = new Customer();
		int length = zipcode.length();
		String correctzip=cust.checkZip(zipcode);
		cust.setZipCode(correctzip);
		System.out.println(cust.getZipCode());
		return cust;
	}


	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}


	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	

}
