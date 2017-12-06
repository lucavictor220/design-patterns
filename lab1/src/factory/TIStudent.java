package factory;

import builder.SkillSet;
import builder.SkillSetBuilder;
import interfaces.Student;

/**
 * Created by vitiok on 11/26/17.
 */
public class TIStudent implements Student {
    private SkillSetBuilder builder = new SkillSetBuilder();
    public SkillSet tiSkillSet = builder.createTIStudengSkillSet();
    public void learn() {
        System.out.println("Read ones, twice, 3 times etc.");
    }

    @Override
    public void showsWhatHeOrSheCanDo() {
        System.out.println("================ TI student ================");
        tiSkillSet.showSkillSet();
        System.out.println("================ TI student ================");
    }
}