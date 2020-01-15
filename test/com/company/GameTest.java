package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void nextMinute() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Game game1 = new Game(Heerenveen, Emmen);
        game1.nextMinute();
        assertEquals(1 ,game1.getCurrentTime());
    }

    @Test
    void getWinner() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
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
    }

    @Test
    void getGoalsOf() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
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
        assertEquals(0, game1.getGoalsOf(Emmen));
    }

    @Test
    void getFullTime() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Game game1 = new Game(Emmen,Heerenveen);
        assertEquals(20, game1.getFullTime());
    }

    @Test
    void setFullTime() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Game game1 = new Game(Emmen,Heerenveen);
        game1.setFullTime(1);
        assertEquals(1, game1.getFullTime());
    }

    @Test
    void getHalfTime() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Game game1 = new Game(Emmen,Heerenveen);
        assertEquals(10, game1.getHalfTime());
    }

    @Test
    void setHalfTime() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Game game1 = new Game(Emmen,Heerenveen);
        game1.setHalfTime(1);
        assertEquals(1, game1.getHalfTime());
    }

    @Test
    void getStartTime() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Game game1 = new Game(Emmen,Heerenveen);
        assertEquals(0, game1.getStartTime());
    }

    @Test
    void setStartTime() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Game game1 = new Game(Emmen,Heerenveen);
        game1.setStartTime(1);
        assertEquals(1, game1.getStartTime());
    }

    @Test
    void getCurrentTime() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Game game1 = new Game(Emmen,Heerenveen);
        assertEquals(0, game1.getCurrentTime());
    }

    @Test
    void setCurrentTime() {
        Player Glenn = new Player("Glenn Bijl", 18);
        Team Emmen = new Team("Emmen", "Emn");
        Player Sven = new Player("Sven Botman", 10);
        Team Heerenveen = new Team("Heerenveen", "Her");
        Game game1 = new Game(Emmen,Heerenveen);
        game1.setCurrentTime(1);
        assertEquals(1, game1.getCurrentTime());
    }
}