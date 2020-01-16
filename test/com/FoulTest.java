package com;

import Actions.Foul;
import Team.Team;
import org.junit.Test;
import Team.Player;

import static org.junit.jupiter.api.Assertions.*;

class FoulTest {

    @Test
    void action() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Foul foul1 = new Foul();
        foul1.action(Emmen, Glenn);
        assertEquals(Emmen, foul1.getTeam());
        assertEquals(1, Glenn.getFouls());
    }
}