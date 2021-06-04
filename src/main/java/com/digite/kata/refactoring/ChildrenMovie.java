package com.digite.kata.refactoring;

public class ChildrenMovie extends Movie{

    public ChildrenMovie(String title) {
        super(title);
    }

    public double calculateAmt(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;

        return  thisAmount;
    }
}
