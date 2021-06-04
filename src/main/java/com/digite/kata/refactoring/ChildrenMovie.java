package com.digite.kata.refactoring;

public class ChildrenMovie implements AmountInterface {
	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	public double getAmount(int a_rentalDays) 
	{
		/*
		 * thisAmount += 1.5; if (each.getDaysRented() > 3) thisAmount +=
		 * (each.getDaysRented() - 3) * 1.5;
		 */
		double w_rentAmount = 1.5;
		if (a_rentalDays > 3)
			w_rentAmount += (a_rentalDays - 3) * 1.5;
		return w_rentAmount;
		}

}
