package com.digite.kata.refactoring;

public class NewReleaseMovie implements InvoiceInt {

    @Override
    public double generateInvoice (Rental each) {
        double thisAmount = 0;
        thisAmount += each.getDaysRented() * 3;
        return thisAmount;
    }

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
