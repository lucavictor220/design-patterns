import adapter.*;
import bridge.AbstractAccount;
import bridge.InternetBanking;
import bridge.StudentAccount;
import bridge.internetBanking.MaibInternetBanking;
import bridge.internetBanking.VictoriaBankInternetBanking;

/**
 * Created by vitiok on 12/12/17.
 */
public class Main {
    public static void main(String[] args) {
        OperationInterface maib = new BankAdapter(new BankAdaptee());
        OperationInterface paypal = new Paypal();
        SimpleClient clientVictor = new SimpleClient("Victor", 200);
        SimpleClient clientAlex = new SimpleClient("Alex", 500);
        maib.fill(clientVictor, 300);
        maib.transfer(clientVictor, 200);
        maib.withdraw(clientVictor, 100);

        paypal.fill(clientVictor, 100);
        paypal.transfer(clientVictor, 50);
        paypal.withdraw(clientVictor, 50);

        AbstractAccount victorAccountAtMaib = new StudentAccount(new MaibInternetBanking(), clientVictor);
        AbstractAccount alexAccountAtVictoriaBank = new StudentAccount(new VictoriaBankInternetBanking(), clientAlex);
        victorAccountAtMaib.show();
        alexAccountAtVictoriaBank.show();
    }
}
