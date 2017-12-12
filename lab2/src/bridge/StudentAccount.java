package bridge;

import adapter.SimpleClient;

/**
 * Created by vitiok on 12/12/17.
 */
public class StudentAccount extends AbstractAccount {
    private SimpleClient client;
    public StudentAccount(InternetBanking internetBanking, SimpleClient client) {
        super(internetBanking);
        this.client = client;
    }

    @Override
    public void show() {
        internetBanking.showAccount(client);
    }

}
