import factory.AbstractUTMFactory;
import factory.FactoryProducer;
import interfaces.Phone;
import factoryMethod.PhoneFactory;
import interfaces.Student;
import interfaces.Teacher;
import prototype.ClassRoom;
import singleton.UTM;

/**
 * Created by vitiok on 11/26/17.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone iPhone = phoneFactory.getPhone("iPhone");
        Phone motorola = phoneFactory.getPhone("Motorola");

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
        fafStudent.setPhone(iPhone);
        fafStudent.showsWhatHeOrSheCanDo();
        tiStudent.learn();
        tiStudent.setPhone(motorola);
        tiStudent.showsWhatHeOrSheCanDo();

        Bostan.present();
        Besliu.present();

        ClassRoom fafClassRoom = new ClassRoom("fafClassRoom", 40);
        ClassRoom tiClassRoom = fafClassRoom.clone();
        tiClassRoom.setName("tiClassRoom");

        System.out.println("===== Clone ==== ");
        fafClassRoom.setName("newNameOfClass");
        fafClassRoom.show();

        tiClassRoom.show();
        System.out.println("===== Clone ==== ");

        utmUniversity.showUTMProffesors();
    }
}
