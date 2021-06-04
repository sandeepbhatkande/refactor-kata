package com.digite.kata.refactoring;

public class RegularMovie extends Movie /*implements MovieInterface*/{

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double calculateAmt(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return  thisAmount;
    }
}
