package factory;

import builder.SkillSet;
import builder.SkillSetBuilder;
import interfaces.Student;

/**
 * Created by vitiok on 11/26/17.
 */
public class FAFStudent implements Student {
    private SkillSetBuilder builder = new SkillSetBuilder();
    public SkillSet fafSkillSet = builder.createFAFStudentSkillSet();
    public void learn() {
        System.out.println("Reads ones and start writing code");
    }
    public void showsWhatHeOrSheCanDo() {
        System.out.println("================ FAF student ================");
        fafSkillSet.showSkillSet();
        System.out.println("================ FAF student ================");
    }
}
