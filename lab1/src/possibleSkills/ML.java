package possibleSkills;

import interfaces.Skill;

/**
 * Created by vitiok on 11/26/17.
 */
public class ML implements Skill {
    @Override
    public String name() {
        return "Machine Learning";
    }

    @Override
    public int timeToLearn() {
        return 2;
    }

    @Override
    public float priceAsEployee() {
        return 300;
    }
}
