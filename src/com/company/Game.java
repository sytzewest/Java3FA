package com.company;

import java.util.ArrayList;

public class Game {
    int fullTime = 20;
    int halfTime = 10;
    int startTime = 0;
    int currentTime = 0;
    int scoreTeamOne = 0;
    int scoreTeamTwo = 0;
    ArrayList<Timeable> listOfTimeables;

    public Game(Team team1, Team team2){
        this.fullTime = fullTime;
        this.halfTime = halfTime;
        this.startTime = startTime;
        this.currentTime = currentTime;
        this.scoreTeamOne = scoreTeamOne;
        this.scoreTeamTwo = scoreTeamTwo;
        listOfTimeables = new ArrayList<>();
    }

    public void nextMinute(){
        if(currentTime == 10){
            System.out.println("Halftime");
        }else if(currentTime == 20){
            System.out.println("Full Time");
        }else{
            currentTime++;
        }
    }

    public void finalScore(){

    }
}


