package bridge.internetBanking;

import adapter.SimpleClient;
import bridge.AbstractAccount;
import bridge.InternetBanking;

/**
 * Created by vitiok on 12/12/17.
 */
public class MaibInternetBanking implements InternetBanking {
    @Override
    public void showAccount(SimpleClient client) {
        System.out.println("Welcome to MAIB Internet Banking");
        System.out.println(client.getFullName() + " current balnce is: " + client.getAccount());
    }
}
