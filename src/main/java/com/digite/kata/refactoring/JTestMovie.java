package com.digite.kata.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class JTestMovie {
	
	@Test
	public void testForSameType()
	{
		Movie obj = new Movie("Movie1", Movie.REGULAR);
		Movie obj1 = new Movie("Movie2", Movie.REGULAR);
		BillingInterface regular = new Regular();
		
		Rental rental = new Rental(obj, 10, regular);
		Rental rental1 = new Rental(obj1, 20, regular);
		
		Customer cust = new Customer("Hitesh Narwani");
		cust.addRental(rental);
		cust.addRental(rental1);
		
		String finalResult = "Rental Record for Hitesh Narwani\nMovie1  14.0\nMovie2  29.0\nAmount owed is 43.0\nYou earned 2 frequent renter points";
				
		String w_bill = Invoice.getInvoice(cust.getName(), cust.getRentals());
		assertEquals(finalResult, w_bill);
		System.out.println(w_bill);
		
	}
	
	@Test
	public void testForDifferntType()
	{
		Movie obj = new Movie("Movie1", Movie.REGULAR);
		Movie obj1 = new Movie("Movie2", Movie.NEW_RELEASE);
		Movie obj2 = new Movie("Movie3", Movie.CHILDRENS);
		BillingInterface regular = new Regular();
		BillingInterface newRelease = new NewRelease();
		BillingInterface children = new Children();
		
		Rental rental = new Rental(obj, 10, regular);
		Rental rental1 = new Rental(obj1, 20, newRelease);
		Rental rental3 = new Rental(obj2, 30, children);
		
		Customer cust = new Customer("Hitesh Narwani");
		cust.addRental(rental);
		cust.addRental(rental1);
		cust.addRental(rental3);
		
		String finalResult = "Rental Record for Hitesh Narwani\nMovie1  14.0\nMovie2  60.0\nMovie3  42.0\nAmount owed is 116.0\nYou earned 3 frequent renter points";
				
		String w_bill = Invoice.getInvoice(cust.getName(), cust.getRentals());
		assertEquals(finalResult, w_bill);
		System.out.println(w_bill);
		
	}
	
}
