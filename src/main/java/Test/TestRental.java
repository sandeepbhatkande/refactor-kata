package Test;

import com.digite.kata.refactoring.*;

import org.junit.*;
import static org.junit.Assert.*;

public class TestRental {
	
	@Test
	public void testSimple() {
		String w_movieName = "m1";
		int w_moviePrice = 100;
		int w_daysRented = 12;
		Movie w_movie = new Movie(w_movieName);
		NewMovieCalculator w_newCalc = new NewMovieCalculator(w_movie); 
		Rental w_r1 = new Rental(w_newCalc,w_daysRented);
		assertEquals(w_daysRented, w_r1.getDaysRented());
	}

}
