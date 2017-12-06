package builder.possibleSkills;

import interfaces.Skill;

/**
 * Created by vitiok on 11/26/17.
 */
public class BashScripting implements Skill {
    @Override
    public String name() {
        return "Bash Scripting";
    }

    @Override
    public int timeToLearn() {
        return 1;
    }

    @Override
    public float priceAsEployee() {
        return 300;
    }
}
