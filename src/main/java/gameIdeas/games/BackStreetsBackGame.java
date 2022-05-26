package gameIdeas.games;

import gameIdeas.beans.GameRequirements;
import gameIdeas.enums.AvailableGames;
import gameIdeas.enums.Duration;
import gameIdeas.enums.Objectives;

public class BackStreetsBackGame implements IGame
{

    GameRequirements gameRequirements;

    @Override
    public void init()
    {
        gameRequirements = new GameRequirements();

        gameRequirements.setGameName(AvailableGames.BACKSTREETS_BACK_GAME.gameName());
        gameRequirements.setPrimaryObjective(Objectives.LINKED_LISTS);
        gameRequirements.setExpectedDuration(Duration.SIXTY_MINUTES);
        gameRequirements.setDescription("BackStreet is back! But they're tangled and need your help.");
        gameRequirements.setInstructions("Participants are given a single link list with 50 nodes. \n" +
                                         "\tEach node contains a string of each band members name, participants\n" +
                                         "\tmust create link lists for each member, and 'untangle' each\n" +
                                         "\tmember into their own list.\n");
    }

    @Override
    public void play()
    {
        System.out.println("Name: " + gameRequirements.getGameName());
        System.out.println("Objective: " + gameRequirements.getPrimaryObjective().valueOf());
        System.out.println("Instructions: " + gameRequirements.getInstructions());
        System.out.println("Duration: " + gameRequirements.getExpectedDuration().valueOf());
        System.out.println();
    }
}
