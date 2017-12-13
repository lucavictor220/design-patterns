package decorator;

/**
 * Created by vitiok on 12/13/17.
 */
public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
