package factoryMethod;

import interfaces.Phone;

/**
 * Created by vitiok on 12/6/17.
 */
public class Motorola implements Phone {
    public String name = "Motorola";
    @Override
    public void ring() {
        System.out.println("The song you want!!!");
    }
}
