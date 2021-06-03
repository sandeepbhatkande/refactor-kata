package com.digite.kata.refactoring;

public class NewMovie extends Movie {
    public NewMovie(String title) {
        super(title);
    }

    public double calculateAmt(int a_daysRented)
    {
        double w_amt = 0;
        w_amt += a_daysRented * 3;
        return w_amt;
    }

    @Override
    public int AddBonusPoint(int a_existingBonus, int a_daysRented) {
        a_existingBonus++;
        // add bonus for a two day new release rental
        if (a_daysRented > 1)
            a_existingBonus++;

        return a_existingBonus;
    }
}
