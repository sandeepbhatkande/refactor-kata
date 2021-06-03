package com.digite.kata.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Invoice
{
    public static String generateInvoice(String _name, Vector<Rental> _rentals)
    {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + _name + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            thisAmount += calculateAmnt(thisAmount, each.getMovie().getPriceCode(),each.getDaysRented());
              // add frequent renter points
            frequentRenterPoints += calculateFrqRenter(frequentRenterPoints,each.getMovie().getPriceCode(), each.getDaysRented());

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    thisAmount + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + totalAmount +
                "\n";
        result += "You earned " + frequentRenterPoints
                +
                " frequent renter points";
        return result;
    }

    public static double calculateAmnt(double a_amount, int a_priceCode, int a_daysRented)
    {
        double w_amt = a_amount;
        switch (a_priceCode) {
            case Movie.REGULAR:
                w_amt += 2;
                if (a_daysRented > 2)
                    w_amt += (a_daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                w_amt += a_daysRented * 3;
                break;
            case Movie.CHILDRENS:
                w_amt += 1.5;
                if (a_daysRented > 3)
                    w_amt += (a_daysRented - 3) * 1.5;
                break;
        }
        return w_amt;
    }

    public static double calculateFrqRenter(int a_freq, int a_priceCode, int a_daysRented)
    {
        int w_totalpoints = a_freq;
        // add frequent renter points
        w_totalpoints++;
        // add bonus for a two day new release rental
        if ((a_priceCode == Movie.NEW_RELEASE) && a_daysRented > 1)
            w_totalpoints++;

        return w_totalpoints;
    }
}