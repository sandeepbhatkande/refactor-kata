package com.digite.kata.refactoring;

public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title) {
        super(title);
    }

    public double calculateAmt(int daysRented) {
        return  daysRented * 3;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        if (daysRented > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
