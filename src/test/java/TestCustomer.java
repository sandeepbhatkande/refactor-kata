import com.digite.kata.refactoring.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestCustomer {

    @Test
    public  void testStatementForChildMovie()
    {
        Customer w_customer = new Customer("shraddha");
        Rental w_rental1 = new Rental(new ChildMovie("Dumbo"), 7);
        w_customer.addRental(w_rental1);
        String w_receipt = w_customer.statement();
        Assertions.assertEquals(w_receipt, "Rental Record for shraddha\n" +
                "\tDumbo\t7.5\n" +
                "Amount owed is 7.5\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public  void testStatementForREGULARMovie()
    {
        Customer w_customer = new Customer("shraddha");
        Rental w_rental1 = new Rental(new RegularMovie("Fast&Furious"), 7);
        w_customer.addRental(w_rental1);
        String w_receipt = w_customer.statement();
        Assertions.assertEquals(w_receipt, "Rental Record for shraddha\n" +
                "\tFast&Furious\t9.5\n" +
                "Amount owed is 9.5\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public  void testStatementForNewMovie()
    {
        Customer w_customer = new Customer("shraddha");
        Rental w_rental1 = new Rental(new NewMovie("Avengers"), 7);
        w_customer.addRental(w_rental1);
        String w_receipt = w_customer.statement();
        Assertions.assertEquals(w_receipt, "Rental Record for shraddha\n" +
                "\tAvengers\t21.0\n" +
                "Amount owed is 21.0\n" +
                "You earned 2 frequent renter points");
    }


}