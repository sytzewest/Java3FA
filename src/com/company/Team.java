package com.company;

import java.util.ArrayList;

public class Team {
    int points = 0;
    int wins = 0;
    int draws = 0;
    int losses = 0;
    String teamName = "";
    String teamAbbreviation;
    public ArrayList<Player> listOfPlayers;

    public Team(String teamName){
        this.points = points;
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        listOfPlayers = new ArrayList<>();
    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamAbbreviation() {
        return teamAbbreviation;
    }

    public void setTeamAbbreviation(String teamAbbreviation) {
        this.teamAbbreviation = teamAbbreviation;
    }
}
