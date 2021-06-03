package com.digite.kata.refactoring;

public class Children implements BillingInterface{
	
	public double getRentAmount(int rentDays)
	{
		double amount = 1.5;
		
		if (rentDays > 3)
			amount += (rentDays - 3) * 1.5;
 
		return amount;
		
	}

	public int getEarnedPoints(int rentDays) {
		int count = 0;
		return count++;
	}
}
