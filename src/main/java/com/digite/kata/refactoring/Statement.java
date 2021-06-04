package com.digite.kata.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Statement {

    public static String getStatement(Customer customer) {

        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = customer.getRentals().elements();
        String result = "Rental Record for " + customer.getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            thisAmount += each.getMovie().calculateAmt(each.getDaysRented());
            // add frequent renter points
            frequentRenterPoints += each.getMovie().calculateFrequentRenterPoints(each.getDaysRented());
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";

        System.out.println(result);
        return result;
    }
}
