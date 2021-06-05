package Test;
import com.digite.kata.refactoring.*;

import org.junit.*;
import static org.junit.Assert.*;


public class TestMovie {
	
	@Test
	public void testSimple() {
		String w_movieName = "m1";
		Movie w_movie = new Movie(w_movieName);
		assertEquals(w_movie.getTitle(), w_movieName);
	}
	

}
