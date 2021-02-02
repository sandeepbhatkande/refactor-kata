package com.digite.kata.refactoring;

public class Rental {

    private Movie _movie;
    private int _daysRented;
    private  BillGenerator _billGenarator;

    public Rental(Movie movie, int daysRented, BillGenerator billGenerator) {
        _movie = movie;
        _daysRented = daysRented;
        _billGenarator = billGenerator;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public BillGenerator getBillGenarator () {
        return _billGenarator;
    }
}
