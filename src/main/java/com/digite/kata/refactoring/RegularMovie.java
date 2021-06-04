package com.digite.kata.refactoring;

public class RegularMovie implements AmountInterface{

	public int getPriceCode() {
		return Movie.REGULAR;
	}

	public double getAmount(int a_rentalDays) 
	{
		/*  if (each.getDaysRented() > 2)
              thisAmount += (each.getDaysRented() - 2) * 1.5;*/
		double w_rentAmount = 2;
		if (a_rentalDays > 2)
			w_rentAmount += (a_rentalDays - 2) * 1.5;
		return w_rentAmount;
	}
}
