package com.digite.kata.refactoring;

public class Rental {

    private MovieCalculator _movieCalculator;
    private int _daysRented;

    public Rental(MovieCalculator a_movieCalculator, int a_daysRented) {
    	_movieCalculator = a_movieCalculator;
        _daysRented = a_daysRented;
    }

    public MovieCalculator getMovieCalculator() {
        return _movieCalculator;
    }

    public int getDaysRented() {
        return _daysRented;
    }
}
