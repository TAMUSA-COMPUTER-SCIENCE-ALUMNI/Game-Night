package gameIdeas.enums;

public enum Objectives
{
    LEETCODE("Leetcode"),
    DATA_STRUCTURES ("Data Structures"),
    API ("API"),
    TESTING ("Testing"),
    STREAMS ("Streams"),
    GIT("Git"),
    LINKED_LISTS("Linked Lists"),
    UNKNOWN("");

    private final String label;

    Objectives(String label)
    {
        this.label = label;
    }

    public Objectives valueOfLabel(String label)
    {
        if (label == null || label.length() == 0)
            return UNKNOWN;

        for (Objectives e : values())
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
