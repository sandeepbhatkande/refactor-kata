package com.digite.kata.refactoring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomer {
    Customer customer;

    @Before
    public void setup () {
        customer = new Customer("Sandeep");
    }

    @Test
    public void testRegularMovieStatement () {
        Rental rental = new Rental(new Movie("Movie1", 0), 6);
        customer.addRental(rental);
        assertEquals("Total rental", "Rental Record for Sandeep\n" +
                "\tMovie1\t8.0\n" +
                "Amount owed is 8.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void testNewReleaseMovieStatement () {
        Rental rental = new Rental(new Movie("Movie2", 1), 8);
        customer.addRental(rental);
        assertEquals("Rental Record for Sandeep\n" +
                "\tMovie2\t24.0\n" +
                "Amount owed is 24.0\n" +
                "You earned 2 frequent renter points", customer.statement());
    }

    @Test
    public void testChildrenMovieStatement () {
        Rental rental = new Rental(new Movie("Movie3", 2), 10);
        customer.addRental(rental);
        assertEquals("Rental Record for Sandeep\n" +
                "\tMovie3\t12.0\n" +
                "Amount owed is 12.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }
}
