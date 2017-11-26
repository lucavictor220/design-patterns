import interfaces.Student;
import interfaces.Teacher;

/**
 * Created by vitiok on 11/26/17.
 */
public abstract class AbstractUTMFactory {
    abstract Student getStudent(String studentGroup);
    abstract Teacher getTeacher(String teacherGroup);

}
