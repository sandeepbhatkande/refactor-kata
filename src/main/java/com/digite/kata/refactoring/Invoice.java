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

            thisAmount += calculateAmnt(thisAmount, each);
              // add frequent renter points
            frequentRenterPoints += calculateFrqRenter(frequentRenterPoints,each);

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



    public static double calculateAmnt(double thisAmount, Rental each)
    {
        return each.getMovie().calculateAmt(each.getDaysRented());
    }

    public static double calculateFrqRenter(int a_freq,  Rental each)
    {
        return each.getMovie().AddBonusPoint(a_freq, each.getDaysRented());
    }
}