package com.company;

import java.util.ArrayList;

public class Team implements Sortable {
    int points = 0;
    int wins = 0;
    int draws = 0;
    int losses = 0;
    String teamName = "";
    String teamAbbreviation;
    public ArrayList<Player> listOfPlayers;

    public Team(String teamName, String teamAbbreviation){
        this.teamName = teamName;
        this.teamAbbreviation = teamAbbreviation;
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

    @Override
    public String toString() {
        return teamName + ": " + points + " pts";
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    @Override
    public int getSortableValue() {
        return points;
    }

    @Override
    public String getDescription() {
        return getTeamName() + " - " + getPoints() + " Points";
    }
}
