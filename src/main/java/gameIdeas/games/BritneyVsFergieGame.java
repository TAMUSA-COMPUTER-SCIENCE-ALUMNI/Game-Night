package gameIdeas.games;

import gameIdeas.beans.GameRequirements;
import gameIdeas.enums.AvailableGames;
import gameIdeas.enums.Duration;
import gameIdeas.enums.Objectives;

public class BritneyVsFergieGame implements Game {

    GameRequirements gameRequirements;

     public void init()
    {
        gameRequirements = new GameRequirements();

        gameRequirements.setGameName(AvailableGames.BRITNEY_VS_FERGIE_GAME.gameName());
        gameRequirements.setPrimaryObjective(Objectives.DATA_STRUCTURES);
        gameRequirements.setExpectedDuration(Duration.FORTY_FIVE_MINUTES);
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
