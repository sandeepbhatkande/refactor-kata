package com.digite.kata.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Invoice {

	public static String getInvoice(String w_custName, Vector<Rental> _rentals) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + w_custName + "\n";
        while (rentals.hasMoreElements()) 
        {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            
            thisAmount = each.getMovieType().getRentAmount(each.getDaysRented());
            frequentRenterPoints += each.getMovieType().getEarnedPoints(each.getDaysRented());
           
            result += each.getMovie().getTitle()+  "  " +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }
}
