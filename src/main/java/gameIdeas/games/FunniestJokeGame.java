package gameIdeas.games;

import gameIdeas.beans.GameRequirements;
import gameIdeas.enums.AvailableGames;
import gameIdeas.enums.Duration;
import gameIdeas.enums.Objectives;

public class FunniestJokeGame implements IGame
{

    GameRequirements gameRequirements;

    @Override
    public void init()
    {
        gameRequirements = new GameRequirements();

        gameRequirements.setGameName(AvailableGames.FUNNIEST_JOKE.gameName());
        gameRequirements.setPrimaryObjective(Objectives.GIT);
        gameRequirements.setExpectedDuration(Duration.SIXTY_MINUTES);
    }

    @Override
    public void play()
    {
        System.out.println("Name: " + gameRequirements.getGameName());
        System.out.println("Objective: " + gameRequirements.getPrimaryObjective().valueOf());
        System.out.println("Duration: " + gameRequirements.getExpectedDuration().valueOf());
        System.out.println();
    }
}
