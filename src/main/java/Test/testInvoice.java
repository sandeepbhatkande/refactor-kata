package Test;

import com.digite.kata.refactoring.*;
import java.util.Enumeration;

import org.junit.*;
import static org.junit.Assert.*;

public class testInvoice {
	
	@Test
	public void testSimple() {
		String w_customerName = "ABC";
		Customer w_c1 = new Customer(w_customerName);
		Invoice w_invoice = new Invoice();
		
		String w_movieName = "m1";
		int w_daysRented = 12;
		Movie w_movie = new Movie(w_movieName);
		NewMovieCalculator w_newCalc = new NewMovieCalculator(w_movie); 
		Rental w_r1 = new Rental(w_newCalc,w_daysRented);
		w_c1.addRental(w_r1);
		
		w_movieName = "m1";
		w_daysRented = 17;
		w_movie = new Movie(w_movieName);
		RegularMovieCalculator w_regCalc = new RegularMovieCalculator(w_movie); 
		Rental w_r2 = new Rental(w_regCalc,w_daysRented);
		w_c1.addRental(w_r2);
		
		w_movieName = "m3";
		w_daysRented = 11;
		w_movie = new Movie(w_movieName);
		ChildrenMovieCalculator w_ChildCalc = new ChildrenMovieCalculator(w_movie); 
		Rental w_r3 = new Rental(w_ChildCalc,w_daysRented);
		w_c1.addRental(w_r3);
		
		System.out.println(w_invoice.generateStatement(w_c1));
		String w_reducedInvoiceString = w_invoice.generateStatement(w_c1).replace('\n', ' ');
		w_reducedInvoiceString =w_reducedInvoiceString.replace('\t', ' '); 
		assertEquals(w_reducedInvoiceString, "Rental Record for ABC  m1 15.0  m1 24.5  m3 13.5 Amount owed is 53.0 You earned 4 frequent renter points");
	}
	
}

