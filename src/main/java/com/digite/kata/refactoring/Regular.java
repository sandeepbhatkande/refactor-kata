package com.digite.kata.refactoring;


public class Regular implements  BillingInterface{

	public double getRentAmount(int rentDays)
	{
		double amount = 2;
		
		if (rentDays > 2)
			amount += (rentDays - 2) * 1.5;
 
		return amount;
		
	}

	public int getEarnedPoints(int rentDays) {
		int count = 0;
		return ++count;
	}
}
