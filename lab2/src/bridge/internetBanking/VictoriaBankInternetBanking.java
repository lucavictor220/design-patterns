package bridge.internetBanking;

import adapter.SimpleClient;
import bridge.AbstractAccount;
import bridge.InternetBanking;

/**
 * Created by vitiok on 12/12/17.
 */
public class VictoriaBankInternetBanking implements InternetBanking {
    @Override
    public void showAccount(SimpleClient client) {
        System.out.println("Welcome to Victoria Bank Internet Banking");
        System.out.println(client.getFullName() + " current balnce is: " + client.getAccount());
    }
}
