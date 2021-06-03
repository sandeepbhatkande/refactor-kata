package com.digite.kata.refactoring;

public class NewRelease implements BillingInterface {
	public double getRentAmount(int rentDays)
	{
		double amount = 0;
	
		amount += rentDays * 3;
 
		return amount;
		
	}

	public int getEarnedPoints(int rentDays) {
		int count = 0;
		count++;
		
		if (rentDays > 1)
			count++;
		
		return count;
	}

}
