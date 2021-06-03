package com.digite.kata.refactoring;

public class Rental {

    private Movie _movie;
    private int _daysRented;
    private BillingInterface _obj;
    
    public Rental(Movie movie, int daysRented, BillingInterface obj) {
        _movie = movie;
        _daysRented = daysRented;
        _obj = obj;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }
    
    public BillingInterface getMovieType()
    {
    	return _obj;
    }
    
}
