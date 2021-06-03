package com.digite.kata.refactoring;

public class NewReleaseMovie implements AmountInterface{
	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getAmount(int a_rentalDays) 
	{
		//thisAmount += each.getDaysRented() * 3;
		double w_rentAmount = a_rentalDays * 3;
		return w_rentAmount;
		}

}
