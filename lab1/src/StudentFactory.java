import interfaces.Student;
import interfaces.Teacher;

/**
 * Created by vitiok on 11/26/17.
 */
public class StudentFactory extends AbstractUTMFactory {

    @Override
    Student getStudent(String studentGroup) {
        switch (studentGroup) {
            case "FAF":
                return new FAFStudent();
            case "TI":
                return new TIStudent();
            default:
                return null;
        }
    }

    @Override
    Teacher getTeacher(String teacherGroup) {
        return null;
    }
}
