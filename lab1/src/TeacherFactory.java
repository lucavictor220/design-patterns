import interfaces.Student;
import interfaces.Teacher;

/**
 * Created by vitiok on 11/26/17.
 */
public class TeacherFactory extends AbstractUTMFactory {

    @Override
    Student getStudent(String studentGroup) {
        return null;
    }

    @Override
    Teacher getTeacher(String teacherGroup) {
        switch (teacherGroup) {
            case "FAF":
                return new FAFProfessor();
            case "TI":
                return new TIProfessor();
            default:
                return null;
        }
    }
}