package gameIdeas.games;


import gameIdeas.beans.GameRequirements;
import gameIdeas.enums.AvailableGames;
import gameIdeas.enums.Duration;
import gameIdeas.enums.Objectives;

public class LeetcodeGame implements IGame
{


    GameRequirements gameRequirements;

    @Override
    public void init()
    {
        gameRequirements = new GameRequirements();

        gameRequirements.setGameName(AvailableGames.LEETCODE_GAME.gameName());
        gameRequirements.setPrimaryObjective(Objectives.LEETCODE);
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
