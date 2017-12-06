package factoryMethod;

import interfaces.Phone;

/**
 * Created by vitiok on 12/6/17.
 */
public class iPhone implements Phone {
    public String name = "iPhone";
    @Override
    public void ring() {
        System.out.println("iPhone cool ring");
    }
}
