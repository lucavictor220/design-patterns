package builder;

import interfaces.Skill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitiok on 11/26/17.
 */
public class SkillSet {
    private List<Skill> skills = new ArrayList<Skill>();

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public int getExpectedSalary() {
        int salary = 0;
        for (Skill skill : skills) {
            salary += skill.priceAsEployee();
        }

        return salary;
    }

    public void showSkillSet() {
        int i = 1;
        for (Skill skill : skills) {
            System.out.println(" === Skill nr." + i + " ===");
            System.out.println("Skill: " + skill.name());
            System.out.println("Time it takes to learn it: " + skill.timeToLearn());
            System.out.println("Price for the skill as employee: " + skill.priceAsEployee());
            i++;
        }
        System.out.println("As an employee I will have: " + this.getExpectedSalary() + " $");
    }
}
