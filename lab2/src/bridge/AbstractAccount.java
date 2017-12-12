package bridge;

import adapter.SimpleClient;

/**
 * Created by vitiok on 12/12/17.
 */
public abstract class AbstractAccount {
    protected InternetBanking internetBanking;

    protected AbstractAccount(InternetBanking internetBanking){
        this.internetBanking = internetBanking;
    }
    public abstract void show();
}
