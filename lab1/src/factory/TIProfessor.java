package factory;

import interfaces.Teacher;

/**
 * Created by vitiok on 11/26/17.
 */
public class TIProfessor implements Teacher {
    @Override
    public void present() {
        System.out.println("Reads slides.");
    }
}
