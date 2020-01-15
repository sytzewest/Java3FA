package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Game {
    int fullTime = 20;
    int halfTime = 10;
    int startTime = 0;
    int currentTime = 0;
    ArrayList<Timeable> listOfTimeables;
    ArrayList<Action> listofActions;
    HashMap<Team, Foul> TeamsAndFouls;

    public Game(Team team1, Team team2){
        this.fullTime = fullTime;
        this.halfTime = halfTime;
        this.startTime = startTime;
        this.currentTime = currentTime;
        listOfTimeables = new ArrayList<>();
        listofActions = new ArrayList<>();
        TeamsAndFouls = new HashMap<>();
    }

    public void nextMinute(){
        if(currentTime == 10){
            System.out.println("Halftime");
            currentTime++;
        }else if(currentTime == 11){
            System.out.println(currentTime + "th" + " Minute: ");
            currentTime++;
            System.out.print(currentTime + "th" + " Minute: ");
        }else if(currentTime == 20){
            System.out.println("Full Time");
        }else{
            currentTime++;
            System.out.println(currentTime + "th" + " Minute: ");
        }
    }

    public void getWinner(Team team1, Team team2){
        if(getGoalsOf(team1) > getGoalsOf(team2)){
            System.out.println("The winner is: " + team1.getTeamName() + " : " + getGoalsOf(team1) + " - " + getGoalsOf(team2));
            team1.points =  team1.points + 3;
            team1.wins++;
            team2.losses++;
        }else if (getGoalsOf(team1) == getGoalsOf(team2)){
            System.out.println("The game ended in a draw! : " + getGoalsOf(team2) + " - " + getGoalsOf(team1));
            team1.points =  team1.points + 1;
            team2.points =  team1.points + 1;
            team1.draws++;
            team2.draws++;
        }else{
            System.out.println("The winner is: " + team2.getTeamName() + " : " + getGoalsOf(team2) + " - " + getGoalsOf(team1));
            team2.points = team2.points + 3;
            team2.wins++;
            team1.losses++;
        }
    }

   public int getGoalsOf(Team team){
       int sum = 0;
       for (Action action: listofActions) {
           if(action.getTeam() == team) {
               if(action instanceof Goal) {
                   sum++;
               }
           }
       }
       return sum;
   }

    public int getFullTime() {
        return fullTime;
    }

    public void setFullTime(int fullTime) {
        this.fullTime = fullTime;
    }

    public int getHalfTime() {
        return halfTime;
    }

    public void setHalfTime(int halfTime) {
        this.halfTime = halfTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }
}


