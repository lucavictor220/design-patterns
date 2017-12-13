package decorator;

/**
 * Created by vitiok on 12/13/17.
 */
public class SportCar extends CarDecorator {
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
