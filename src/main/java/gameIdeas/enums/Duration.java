package gameIdeas.enums;

public enum Duration
{
    FIFTEEN_MINUTES ("15 Minutes"),
    THIRTY_MINUTES("30 Minutes"),
    FORTY_FIVE_MINUTES("45 Minutes"),
    SIXTY_MINUTES("60 minutes"),
    UNKNOWN("");

    private final String label;

    Duration(String label)
    {
        this.label = label;
    }

    public Duration valueOfLabel(String label)
    {
        if (label == null || label.length() == 0)
            return UNKNOWN;

        for (Duration e : values())
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

}
