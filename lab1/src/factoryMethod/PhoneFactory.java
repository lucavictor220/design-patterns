package factoryMethod;

import interfaces.Phone;

/**
 * Created by vitiok on 12/6/17.
 */
public class PhoneFactory {

    public Phone getPhone(String name) {
        switch(name) {
            case "iPhone":
                return new iPhone();
            case "Motorola":
                return new Motorola();
            default:
                return null;
        }
    }

}
