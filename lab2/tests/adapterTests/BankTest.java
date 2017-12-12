package adapterTests;

import adapter.BankAdaptee;
import adapter.BankAdapter;
import adapter.OperationInterface;
import adapter.SimpleClient;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vitiok on 12/12/17.
 */
public class BankTest {
    OperationInterface moldinconbank = new BankAdapter(new BankAdaptee());

    @Test
    public void fillTest() throws Exception {
        SimpleClient john = new SimpleClient("John", 400);
        moldinconbank.fill(john, 200);
        assertEquals(john.getAccount(), 590);
    }

    @Test
    public void transferTest() throws Exception {
        SimpleClient alex = new SimpleClient("Alex", 100);
        moldinconbank.transfer(alex, 50);
        assertEquals(alex.getAccount(), 40);
    }

    @Test
    public void withDrawTest() throws Exception {
        SimpleClient vallery = new SimpleClient("Vallery", 500);
        moldinconbank.transfer(vallery, 400);
        assertEquals(vallery.getAccount(), 90);
    }
}
