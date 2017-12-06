package factory;

import interfaces.Teacher;

/**
 * Created by vitiok on 11/26/17.
 */
public class FAFProfessor implements Teacher {
    @Override
    public void present() {
        System.out.println("Explain slides and give real examples");
    }
}
