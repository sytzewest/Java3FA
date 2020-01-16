package Main;

import Actions.Action;
import Actions.Goal;
import Interfaces.Timeable;
import Team.Team;

import java.util.ArrayList;

public class Game {
    private int fullTime = 20;
    private int halfTime = 10;
    private int startTime = 0;
    private int currentTime = 0;
    public ArrayList<Timeable> listOfTimeables;
    public ArrayList<Action> listofActions;

    public Game(Team team1, Team team2){
        this.fullTime = fullTime;
        this.halfTime = halfTime;
        this.startTime = startTime;
        this.currentTime = currentTime;
        listOfTimeables = new ArrayList<>();
        listofActions = new ArrayList<>();
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
            team1.addPoints(3);
            team1.addWin();
            team2.addLoss();
        }else if (getGoalsOf(team1) == getGoalsOf(team2)){
            System.out.println("The game ended in a draw! : " + getGoalsOf(team2) + " - " + getGoalsOf(team1));
            team1.addPoints(1);
            team2.addPoints(1);
            team1.addDraw();
            team2.addDraw();
        }else{
            System.out.println("The winner is: " + team2.getTeamName() + " : " + getGoalsOf(team2) + " - " + getGoalsOf(team1));
            team2.addPoints(3);
            team2.addWin();
            team1.addLoss();
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


