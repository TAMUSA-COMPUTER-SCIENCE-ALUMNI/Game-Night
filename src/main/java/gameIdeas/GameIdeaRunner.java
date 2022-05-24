package gameIdeas;

import gameIdeas.games.IGame;
import gameIdeas.enums.AvailableGames;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameIdeaRunner
{

    public static void main(String[] args)
    {
        List<IGame> games = getAvailableGames();

        for (IGame n : games)
        {
            n.init();
            n.play();
        }

    }

    private static List<IGame> getAvailableGames()
    {
        List<IGame> games = new ArrayList<>();

        for (AvailableGames g : AvailableGames.values())
        {
            if (g == AvailableGames.UNKNOWN)
                continue;

            Optional<Object> o = getGameInstance("gameIdeas.games." + g.valueOf());
            o.ifPresent(value -> games.add((IGame) value));
        }

        return games;
    }

    private static Optional<Object> getGameInstance(String path)
    {
        Object gameClass = null;

        try
        {
            gameClass = Class.forName(path).getDeclaredConstructor().newInstance();
        }
         catch (Exception e)
        {
            e.printStackTrace();
        }

        return  Optional.ofNullable(gameClass);

    }

}
