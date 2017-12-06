package factory;

import interfaces.Student;
import interfaces.Teacher;

/**
 * Created by vitiok on 11/26/17.
 */
public abstract class AbstractUTMFactory {
    public abstract Student getStudent(String studentGroup);
    public abstract Teacher getTeacher(String teacherGroup);

}
