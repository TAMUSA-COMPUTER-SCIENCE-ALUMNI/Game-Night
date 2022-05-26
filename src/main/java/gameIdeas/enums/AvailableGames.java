package gameIdeas.enums;

public enum AvailableGames
{
    BRITNEY_VS_FERGIE_GAME("BritneyVsFergieGame"),
    LEETCODE_GAME("LeetcodeGame"),
    WORM_GAME("TheWormsCrawlInGame"),
    FUNNIEST_JOKE("FunniestJokeGame"),
    BACKSTREETS_BACK_GAME("BackStreetsBackGame"),
    UNKNOWN("");

    private final String label;

    AvailableGames(String label)
    {
        this.label = label;
    }

    public AvailableGames valueOfLabel(String label)
    {
        if (label == null || label.length() == 0)
            return UNKNOWN;

        for (AvailableGames e : values())
        {
            if (e.label.equals(label))
            {
                return e;
            }
        }
        return UNKNOWN;
    }

    public String valueOf()
    {
        return this.label;
    }

    public String gameName()
    {
        return label.substring(0, label.indexOf("Game"));
    }
}
