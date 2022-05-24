package gameIdeas;

import gameIdeas.enums.Duration;
import gameIdeas.enums.Objectives;

import java.util.List;

public class GameRequirements
{
    Objectives primaryObjective;
    List<Objectives> secondaryObjectives;
    Duration expectedDuration;
    String rules;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    String gameName;




    public Objectives getPrimaryObjective() {
        return primaryObjective;
    }

    public void setPrimaryObjective(Objectives primaryObjective) {
        this.primaryObjective = primaryObjective;
    }

    public List<Objectives> getSecondaryObjectives() {
        return secondaryObjectives;
    }

    public void setSecondaryObjectives(List<Objectives> secondaryObjectives) {
        this.secondaryObjectives = secondaryObjectives;
    }

    public Duration getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(Duration expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public String getDescription() {
        return rules;
    }

    public void setDescription(String description) {
        this.rules = description;
    }

}
