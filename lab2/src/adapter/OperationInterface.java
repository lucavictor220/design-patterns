package adapter;

/**
 * Created by vitiok on 12/12/17.
 */
public interface OperationInterface {
    void fill(SimpleClient client, int amount);
    void transfer(SimpleClient client, int amount);
    void withdraw(SimpleClient client, int amount);
}
