package com.digite.kata.refactoring;

public class ChildMovie extends Movie {


    public ChildMovie(String title) {
        super(title);

    }
    public double calculateAmt(int a_daysRented) {
        double w_amt = 0;
        w_amt += 1.5;
        if (a_daysRented > 3)
            w_amt += (a_daysRented - 3) * 1.5;
        return w_amt;
    }

}
