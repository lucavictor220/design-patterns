package adapterTests;

import adapter.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vitiok on 12/12/17.
 */
public class PaypalTest {
    OperationInterface paypal = new Paypal();

    @Test
    public void fillTest() throws Exception {
        SimpleClient john = new SimpleClient("John", 400);
        paypal.fill(john, 200);
        assertEquals(john.getAccount(), 595);
    }

    @Test
    public void transferTest() throws Exception {
        SimpleClient alex = new SimpleClient("Alex", 100);
        paypal.transfer(alex, 50);
        assertEquals(alex.getAccount(), 45);
    }

    @Test
    public void withDrawTest() throws Exception {
        SimpleClient vallery = new SimpleClient("Vallery", 500);
        paypal.transfer(vallery, 400);
        assertEquals(vallery.getAccount(), 95);
    }
}
