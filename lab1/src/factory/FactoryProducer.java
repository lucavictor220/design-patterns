package factory;

import factory.AbstractUTMFactory;

/**
 * Created by vitiok on 11/26/17.
 */
public class FactoryProducer {

    public static AbstractUTMFactory getFactory(String entity) {
        switch (entity) {
            case "STUDENT":
                return new StudentFactory();
            case "TEACHER":
                return new TeacherFactory();
            default:
                return null;
        }

    }
}
