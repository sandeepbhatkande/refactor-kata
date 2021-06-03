import com.digite.kata.refactoring.Customer;
import com.digite.kata.refactoring.Movie;
import com.digite.kata.refactoring.Rental;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestCustomer {

    @Test
    public  void testStatementForChildMovieWithWrongPriceCode()
    {
        Customer w_customer = new Customer("shraddha");
        Rental w_rental1 = new Rental(new Movie("Dumbo", 10), 7);
        w_customer.addRental(w_rental1);
        String w_receipt = w_customer.statement();
        Assertions.assertEquals(w_receipt, "Rental Record for shraddha\n" +
                "\tDumbo\t0.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 1 frequent renter points");
    }




}