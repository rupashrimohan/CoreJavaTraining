package com.exceptionhandling;

public class Walgreens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Walgreens store12 = new Walgreens();
		try {
			store12.validateCreditCard("1100567890123456");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid Credit card");
		}

	}

	public void validateCreditCard(String creditCard) throws FinancialValidException
	{
		String sub=creditCard.substring(0, 4);

		if((creditCard.length()==16)&&(sub!="1100"))
		{
		
		System.out.println("Valid");
		}
		else if((creditCard.length()==15)&&(sub=="1100"))
		{
			System.out.println("AMEX");
		
			
		}
		else 
		{
			FinancialValidException ex= new FinancialValidException();
		      throw ex;
		}
}
}