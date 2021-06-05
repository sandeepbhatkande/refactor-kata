package Test;

import com.digite.kata.refactoring.*;
import java.util.Enumeration;

import org.junit.*;
import static org.junit.Assert.*;

public class testCustomer {
	
	@Test
	public void testSimple() {
		String w_movieName = "m1";
		int w_moviePrice = 100;
		int w_daysRented = 12;
		String w_customerName = "ABC";
		Movie w_movie = new Movie(w_movieName);
		NewMovieCalculator w_newCalc = new NewMovieCalculator(w_movie); 
		Rental w_r1 = new Rental(w_newCalc,w_daysRented);
		Customer w_c1 = new Customer(w_customerName);
		w_c1.addRental(w_r1);
		Enumeration<Rental> rentals = w_c1.getRental().elements();
		
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			assertEquals(each.getMovieCalculator().getMovie().getTitle(), w_movie.getTitle());
        }
     }
}
