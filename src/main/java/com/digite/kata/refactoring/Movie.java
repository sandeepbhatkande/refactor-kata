package com.digite.kata.refactoring;

public class Movie {
    private String _title;

    public Movie(String title) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }

    public double calculateAmt(int daysRented) {
        return  0.0;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return  1;
    }
}