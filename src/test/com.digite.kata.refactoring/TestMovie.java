package com.digite.kata.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMovie {
    @Test
    public void testRegularMovie()
    {
        Movie w_movieObj = new Movie("My Movie1", 0);
        w_movieObj.setPriceCode(4);
        Rental each = new Rental(w_movieObj, 5);
        double w_amount = w_movieObj.generateInvoice(each);
        Assertions.assertEquals(w_amount, 5);
    }

    @Test
    public void testChildrenMovie()
    {
        Movie w_movieObj = new Movie("My Movie2", 2);
        w_movieObj.setPriceCode(4);
        Rental each = new Rental(w_movieObj, 3);
        //InvoiceInt w_childMovie = new ChildrenMovie();
        double w_amount = w_movieObj.generateInvoice(each);
        Assertions.assertEquals(w_amount, 3);
    }

    @Test
    public void testNewReleaseMovie()
    {
        Movie w_movieObj = new Movie("My Movie3", 1);
        w_movieObj.setPriceCode(4);
        Rental each = new Rental(w_movieObj, 12);
       // InvoiceInt w_regMov = new NewReleaseMovie();
        double w_amount = w_movieObj.generateInvoice(each);
        Assertions.assertEquals(w_amount, 12);
    }
}
