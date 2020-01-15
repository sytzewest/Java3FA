package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        Player Glenn = new Player("Glenn Bijl", 18);
        assertEquals("Glenn Bijl",Glenn.getName());
    }

    @Test
    void getShirtNumber() {
        Player Glenn = new Player("Glenn Bijl", 18);
        assertEquals(18,Glenn.getShirtNumber());
    }

    @Test
    void getGoals() {
        Goal goal1 = new Goal();
        Team Emmen = new Team("Emmen", "Emn");
        Player Glenn = new Player("Glenn Bijl", 18);
        Emmen.listOfPlayers.add(Glenn);
        goal1.action(Emmen, Glenn);
        assertEquals(1,Glenn.getGoals());
    }

    @Test
    void getFouls() {
        Foul foul1 = new Foul();
        Team Emmen = new Team("Emmen", "Emn");
        Player Glenn = new Player("Glenn Bijl", 18);
        Emmen.listOfPlayers.add(Glenn);
        foul1.action(Emmen, Glenn);
        assertEquals(1,Glenn.getFouls());
    }
}