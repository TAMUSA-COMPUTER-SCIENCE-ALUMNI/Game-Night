package gameIdeas.games;

import gameIdeas.beans.GameRequirements;
import gameIdeas.enums.AvailableGames;
import gameIdeas.enums.Duration;
import gameIdeas.enums.Objectives;

public class MurderInChateauJVMPartOneGame implements IGame
{
    GameRequirements gameRequirements;

    @Override
    public void init()
    {
        gameRequirements = new GameRequirements();

        gameRequirements.setGameName(AvailableGames.MURDER_IN_CHATEAU_JVM_PART_ONE.gameName());
        gameRequirements.setPrimaryObjective(Objectives.STRINGS);
        gameRequirements.setExpectedDuration(Duration.THIRTY_MINUTES);
        gameRequirements.setDescription("There's been a murder!! Can you help solve it?");
        gameRequirements.setInstructions("1. String was murdered! At the crime scene police only found\n" +
            "the undecipherable clue of 'xvxmxYou will never f  '.\n" +
            "Strangely, police also found the mysterious 'String.substring()' and 'String.trim()'\n" +
            "Can you help police solve this mystery in time?");
    }

    @Override
    public void play()
    {
        System.out.println("Name: " + gameRequirements.getGameName());
        System.out.println("Objective: " + gameRequirements.getPrimaryObjective().valueOf());
        System.out.println("Description: " + gameRequirements.getDescription());
        System.out.println("Instructions: " + gameRequirements.getInstructions());
        System.out.println("Duration: " + gameRequirements.getExpectedDuration().valueOf());
        System.out.println();
    }
}
