import possibleSkills.*;

/**
 * Created by vitiok on 11/26/17.
 */
public class SkillSetBuilder {
    public SkillSet createFAFStudentSkillSet() {
        SkillSet fafSkillSet = new SkillSet();
        fafSkillSet.addSkill(new BashScripting());
        fafSkillSet.addSkill(new DistributedProgramming());
        fafSkillSet.addSkill(new ML());
        fafSkillSet.addSkill(new ServerScripting());

        return fafSkillSet;
    }

    public SkillSet createTIStudengSkillSet() {
        SkillSet tiSkillSet = new SkillSet();
        tiSkillSet.addSkill(new Cooking());
        tiSkillSet.addSkill(new HTML());
        tiSkillSet.addSkill(new MultipleOSInstalation());

        return tiSkillSet;
    }
}
