package gameIdeas.games;

import gameIdeas.beans.GameRequirements;
import gameIdeas.enums.AvailableGames;
import gameIdeas.enums.Duration;
import gameIdeas.enums.Objectives;

public class MurderInChateauJVMPartTwoGame implements IGame
{
    GameRequirements gameRequirements;

    @Override
    public void init()
    {
        gameRequirements = new GameRequirements();

        gameRequirements.setGameName(AvailableGames.MURDER_IN_CHATEAU_JVM_PART_TWO.gameName());
        gameRequirements.setPrimaryObjective(Objectives.STRINGS);
        gameRequirements.setExpectedDuration(Duration.THIRTY_MINUTES);
        gameRequirements.setDescription("There's been a murder!! AGAIN!");
        gameRequirements.setInstructions("2. After Strings shocking murder, he was brought back \n" +
                "to life by the mysterious warlock known as 'new'. However, upon return \n" +
                "String was murdered again. This time the only clues found were \n" +
                "'i3n3545d948 893m92-12e' and the hint 'String.replace()'. \n" +
            "Unfortunately, another clue was heavily stained with blood and isn't legible.\n" +
            "Can you help police research what this hint could be, and help them find \n" +
            "the killer?");
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
