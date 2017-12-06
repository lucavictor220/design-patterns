package builder.possibleSkills;

import interfaces.Skill;

/**
 * Created by vitiok on 11/26/17.
 */
public class DistributedProgramming implements Skill {
    @Override
    public String name() {
        return "Distributed Programming";
    }

    @Override
    public int timeToLearn() {
        return 3;
    }

    @Override
    public float priceAsEployee() {
        return 400;
    }
}
