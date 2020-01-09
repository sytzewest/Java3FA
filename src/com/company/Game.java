package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Game {
    int fullTime = 20;
    int halfTime = 10;
    int startTime = 0;
    int currentTime = 0;
    ArrayList<Timeable> listOfTimeables;
    HashMap<Team, Goal> TeamsAndGoals;
    HashMap<Team, Foul> TeamsAndFouls;

    public Game(Team team1, Team team2){
        this.fullTime = fullTime;
        this.halfTime = halfTime;
        this.startTime = startTime;
        this.currentTime = currentTime;
        listOfTimeables = new ArrayList<>();
        TeamsAndGoals = new HashMap<>();
        TeamsAndFouls = new HashMap<>();
    }

    public void nextMinute(){
        if(currentTime == 10){
            System.out.println("Halftime");
        }else if(currentTime == 20){
            System.out.println("Full Time");
        }else{
            currentTime++;
            System.out.println(currentTime + "th" + " Minute");
        }
    }

    public void finalScore(){

    }

   /* public String getWinner(){
        if(team1.score>team2.score){
            System.out.println("The winner is:");
            return team1.name;
            team1.points =  team1.points + 3;
            team1.wins++;
            team2.losses++;
        }else{
            System.out.println("The winner is:");
            return team2.name;
            team2.points = team2.points + 3;
            team2.wins++;
            team1.losses++;
        }
    }

    */
}


