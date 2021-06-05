package com.digite.kata.refactoring;

import java.util.Enumeration;

public class Invoice {
	
	public String generateStatement(Customer a_customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = a_customer.getRental().elements();
        String result = "Rental Record for " + a_customer.getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            MovieCalculator w_movieCal = each.getMovieCalculator();
            thisAmount += w_movieCal.amountCalculator(each.getDaysRented());
       
            frequentRenterPoints++;
            frequentRenterPoints += w_movieCal.getFrequencyIncrement();
            //show figures for this rental
            result += "\t" + each.getMovieCalculator().getMovie().getTitle() + "\t" +
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
