package com.digite.kata.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JTestCustomer {

    @Test
    public void testgetName() {
        Customer w_cust = new Customer("testcust");
        assertEquals("testcust", w_cust.getName());
    }

    @Test
    public void testStatement_RegularMovie() {
        Customer w_cust = new Customer("testcust");

        Movie w_movie = new RegularMovie("abc");

        Rental w_rental = new Rental(w_movie, 30);

        w_cust.addRental(w_rental);

        assertEquals("Rental Record for testcust\n" +
                "\tabc\t44.0\n" +
                "Amount owed is 44.0\n" +
                "You earned 1 frequent renter points", w_cust.statement());
    }

    @Test
    public void testStatement_NewReleaseMovie() {
        Customer w_cust = new Customer("testcust");

        Movie w_movie = new NewReleaseMovie("NewRelease");

        Rental w_rental = new Rental(w_movie, 30);

        w_cust.addRental(w_rental);

        assertEquals("Rental Record for testcust\n" +
                "\tNewRelease\t90.0\n" +
                "Amount owed is 90.0\n" +
                "You earned 2 frequent renter points", w_cust.statement());
    }

    @Test
    public void testStatement_ChildrenMovie() {
        Customer w_cust = new Customer("testcust");

        Movie w_movie = new ChildrenMovie("Children");

        Rental w_rental = new Rental(w_movie, 30);

        w_cust.addRental(w_rental);

        assertEquals("Rental Record for testcust\n" +
                "\tChildren\t42.0\n" +
                "Amount owed is 42.0\n" +
                "You earned 1 frequent renter points", w_cust.statement());
    }

}
