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
        BillGenerator billGenerator = new RegularMovie();
        Rental rental = new Rental(new Movie("Movie1", 0), 6, billGenerator);
        customer.addRental(rental);
        assertEquals("Total rental", "Rental Record for Sandeep\n" +
                "\tMovie1\t8.0\n" +
                "Amount owed is 8.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void testNewReleaseMovieStatement () {
        BillGenerator billGenerator = new NewReleaseMovie();
        Rental rental = new Rental(new Movie("Movie2", 1), 8, billGenerator);
        customer.addRental(rental);
        assertEquals("Rental Record for Sandeep\n" +
                "\tMovie2\t24.0\n" +
                "Amount owed is 24.0\n" +
                "You earned 2 frequent renter points", customer.statement());
    }

    @Test
    public void testChildrenMovieStatement () {
        BillGenerator billGenerator = new ChildrenMovie();
        Rental rental = new Rental(new Movie("Movie3", 2), 10, billGenerator);
        customer.addRental(rental);

        assertEquals("Rental Record for Sandeep\n" +
                "\tMovie3\t12.0\n" +
                "Amount owed is 12.0\n" +
                "You earned 1 frequent renter points", customer.statement());
    }

   @Test
    public void testRegularAndChildrenMovieStatement () {
       BillGenerator billGenerator1 = new RegularMovie();
        Rental rental = new Rental(new Movie("Movie1", 0), 6, billGenerator1);
        customer.addRental(rental);
       BillGenerator billGenerator = new ChildrenMovie();
        Rental rental1 = new Rental(new Movie("Movie4", 2), 6, billGenerator);
        customer.addRental(rental1);

        assertEquals("Rental Record for Sandeep\n" +
                "\tMovie1\t8.0\n" +
                "\tMovie4\t6.0\n" +
                "Amount owed is 14.0\n" +
                "You earned 2 frequent renter points", customer.statement());
    }
}
