package builder.possibleSkills;

import interfaces.Skill;

/**
 * Created by vitiok on 11/26/17.
 */
public class ServerScripting implements Skill {
    @Override
    public String name() {
        return "ServerScripting";
    }

    @Override
    public int timeToLearn() {
        return 2;
    }

    @Override
    public float priceAsEployee() {
        return 200;
    }
}
