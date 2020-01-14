package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
        }else if(currentTime == 20){
            System.out.println("Full Time");
        }else{
            currentTime++;
            System.out.println(currentTime + "th" + " Minute");
        }
    }

    public void getWinner(Game game, Team team1, Team team2){
        if(getGoalsOf(team1) > getGoalsOf(team2)){
            System.out.println("The winner is:");
            System.out.println(team1.getTeamName());
            team1.points =  team1.points + 3;
            team1.wins++;
            team2.losses++;
        }else if (getGoalsOf(team1) == getGoalsOf(team2)){
            System.out.println("The game ended in a draw!");
            team1.points =  team1.points + 1;
            team2.points =  team1.points + 1;
            team1.draws++;
            team2.draws++;
        }else{
            System.out.println("The winner is:");
            System.out.println(team2.getTeamName());
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
}


