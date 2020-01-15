package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void getPoints() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Heerenveen.listOfPlayers.add(Sven);
        Emmen.listOfPlayers.add(Glenn);
        Game game1 = new Game(Heerenveen, Emmen);
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.getWinner(Emmen, Heerenveen);
        assertEquals(1, Emmen.getPoints());
        assertEquals(1, Heerenveen.getPoints());
    }

    @Test
    void getWins() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Heerenveen.listOfPlayers.add(Sven);
        Emmen.listOfPlayers.add(Glenn);
        Goal goal1 = new Goal();
        Game game1 = new Game(Heerenveen, Emmen);
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        goal1.action(Emmen, Glenn);
        game1.listofActions.add(goal1);
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.getWinner(Emmen, Heerenveen);
        assertEquals(1, Emmen.getWins());
        assertEquals(0, Heerenveen.getWins());
    }

    @Test
    void getLosses() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Heerenveen.listOfPlayers.add(Sven);
        Emmen.listOfPlayers.add(Glenn);
        Goal goal1 = new Goal();
        Game game1 = new Game(Heerenveen, Emmen);
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        goal1.action(Emmen, Glenn);
        game1.listofActions.add(goal1);
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.getWinner(Emmen, Heerenveen);
        assertEquals(0, Emmen.getLosses());
        assertEquals(1, Heerenveen.getLosses());
    }

    @Test
    void getTeamName() {
        Team Emmen = new Team("Emmen", "Emn");
        assertEquals("Emmen", Emmen.getTeamName());
    }

    @Test
    void getTeamAbbreviation() {
        Team Emmen = new Team("Emmen", "Emn");
        assertEquals("Emn", Emmen.getTeamAbbreviation());
    }

    @Test
    void getDraws() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Heerenveen.listOfPlayers.add(Sven);
        Emmen.listOfPlayers.add(Glenn);
        Goal goal1 = new Goal();
        Goal goal2 = new Goal();
        Game game1 = new Game(Heerenveen, Emmen);
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        goal1.action(Emmen, Glenn);
        goal2.action(Heerenveen, Sven);
        game1.listofActions.add(goal1);
        game1.listofActions.add(goal2);
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.nextMinute();
        game1.getWinner(Emmen, Heerenveen);
        assertEquals(1, Emmen.getDraws());
        assertEquals(1, Heerenveen.getDraws());
    }
}