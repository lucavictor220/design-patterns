package decorator;

/**
 * Created by vitiok on 12/13/17.
 */
public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
