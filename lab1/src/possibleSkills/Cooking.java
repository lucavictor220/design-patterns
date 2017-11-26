package possibleSkills;

import interfaces.Skill;

/**
 * Created by vitiok on 11/26/17.
 */
public class Cooking implements Skill {
    @Override
    public String name() {
        return "Cooking";
    }

    @Override
    public int timeToLearn() {
        return 1;
    }

    @Override
    public float priceAsEployee() {
        return 100;
    }
}
