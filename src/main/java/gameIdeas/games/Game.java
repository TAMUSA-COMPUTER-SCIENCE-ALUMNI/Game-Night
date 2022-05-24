package gameIdeas.beans;

import gameIdeas.enums.Duration;
import gameIdeas.enums.Objectives;

import java.util.List;

public interface Game
{
        void setup();
        void play();
        void cleanup();
}
