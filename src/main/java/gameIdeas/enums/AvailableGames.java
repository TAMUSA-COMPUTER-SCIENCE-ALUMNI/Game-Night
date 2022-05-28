package gameIdeas.enums;

public enum AvailableGames
{
    BRITNEY_VS_FERGIE_GAME("BritneyVsFergieGame"),
    LEETCODE_GAME("LeetcodeGame"),
    THE_WORMS_CRAWL_IN("TheWormsCrawlInGame"),
    FUNNIEST_JOKE_GAME("FunniestJokeGame"),
    BACKSTREETS_BACK_GAME("BackStreetsBackGame"),
    MURDER_IN_CHATEAU_JVM_PART_ONE("MurderInChateauJVMPartOneGame"),
    MURDER_IN_CHATEAU_JVM_PART_TWO("MurderInChateauJVMPartTwoGame"),
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
