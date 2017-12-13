package decorator;

/**
 * Created by vitiok on 12/13/17.
 */
public class Main {
    public static void main(String[] args) {
        Car sportsCar = new BasicCar();
        sportsCar.assemble();
        System.out.println("\n=======");

        Car sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
        System.out.println("\n=======");
    }
}
