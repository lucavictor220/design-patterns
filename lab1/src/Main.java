import interfaces.Student;
import interfaces.Teacher;

/**
 * Created by vitiok on 11/26/17.
 */
public class Main {
    public static void main(String[] args) {
        AbstractUTMFactory studentFactory = FactoryProducer.getFactory("STUDENT");
        AbstractUTMFactory teacherFactory = FactoryProducer.getFactory("TEACHER");

        assert studentFactory != null;
        Student fafStudent = studentFactory.getStudent("FAF");
        Student tiStudent = studentFactory.getStudent("TI");

        fafStudent.learn();
        tiStudent.learn();

        assert teacherFactory != null;
        Teacher Bostan = teacherFactory.getTeacher("FAF");
        Teacher Besliu = teacherFactory.getTeacher("TI");

        fafStudent.learn();
        tiStudent.learn();

        Bostan.present();
        Besliu.present();

    }
}
