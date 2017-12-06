import factory.AbstractUTMFactory;
import factory.FactoryProducer;
import interfaces.Student;
import interfaces.Teacher;
import singleton.UTM;

/**
 * Created by vitiok on 11/26/17.
 */
public class Main {
    public static void main(String[] args) {
        UTM utmUniversity = UTM.getInstance();
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

        utmUniversity.addProfesor(Bostan);
        utmUniversity.addProfesor(Besliu);


        fafStudent.learn();
        fafStudent.showsWhatHeOrSheCanDo();
        tiStudent.learn();
        tiStudent.showsWhatHeOrSheCanDo();

        Bostan.present();
        Besliu.present();

        utmUniversity.showUTMProffesors();
    }
}
