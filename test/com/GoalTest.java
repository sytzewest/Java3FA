package com;

import Actions.Goal;
import Team.Team;
import Team.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoalTest {

    @Test
    void action() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Goal goal1 = new Goal();
        goal1.action(Emmen, Glenn);
        assertEquals(Emmen, goal1.getTeam());
        assertEquals(1, Glenn.getGoals());
    }
}