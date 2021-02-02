package com.digite.kata.refactoring;

public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public double getAmount() {
        double totalAmount = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                totalAmount += 2;
                if (getDaysRented() > 2)
                    totalAmount += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                totalAmount += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                totalAmount += 1.5;
                if (getDaysRented() > 3)
                    totalAmount += (getDaysRented() - 3) * 1.5;
                break;
        }
        return  totalAmount;
    }

    public int getRrequentRenterPoints () {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            return  2;
        return 1;

    }
}
