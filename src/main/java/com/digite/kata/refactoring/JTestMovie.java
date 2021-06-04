package com.digite.kata.refactoring;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JTestMovie 
{
	@Test
    public void testRegularMovie()
    {
		Movie w_movieObj = new Movie("Movie1", 0);
		w_movieObj.setPriceCode(4);
		AmountInterface w_regMov = new RegularMovie();
		double w_amount = w_movieObj.getAmount(w_movieObj, w_regMov);
		assertEquals(w_amount, 5);
    }
	
	@Test
    public void testChildrenMovie()
    {
		Movie w_movieObj = new Movie("Movie2", 2);
		w_movieObj.setPriceCode(4);
		AmountInterface w_childMovie = new ChildrenMovie();
		double w_amount = w_movieObj.getAmount(w_movieObj, w_childMovie);
		assertEquals(w_amount, 3);
    }
	
	@Test
    public void testNewReleaseMovie()
    {
		Movie w_movieObj = new Movie("Movie3", 1);
		w_movieObj.setPriceCode(4);
		AmountInterface w_regMov = new NewReleaseMovie();
		double w_amount = w_movieObj.getAmount(w_movieObj, w_regMov);
		assertEquals(w_amount, 12);
    }
}
