/**
 * Created by vitiok on 11/26/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        AbstractUTMFactory studentFactory = FactoryProducer.getFactory("STUDENT");
        AbstractUTMFactory teacherFactory = FactoryProducer.getFactory("TEACHER");
    }
}
