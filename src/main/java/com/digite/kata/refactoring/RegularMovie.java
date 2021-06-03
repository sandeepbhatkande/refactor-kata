package com.digite.kata.refactoring;

public class RegularMovie extends Movie
{
    public RegularMovie(String title) {
        super(title);
    }

    public double calculateAmt(int a_daysRented) {
        double w_amt = 0;
        w_amt += 2;
        if (a_daysRented > 2)
            w_amt += (a_daysRented - 2) * 1.5;
        return w_amt;
    }
    @Override
    public int AddBonusPoint(int a_existingBonus, int daysRented) {
        return super.AddBonusPoint(a_existingBonus, daysRented);
    }
}
