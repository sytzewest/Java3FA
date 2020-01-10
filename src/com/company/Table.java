package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Table {
    ArrayList<Team> listOfTeams;
    ArrayList<Player> listOfPlayers;
    int maxPoints = -1;


    public Table(){
        listOfTeams = new ArrayList<>();
        listOfPlayers = new ArrayList<>();
    }

    public void printTable(){
        
    }

    public void printTopScorers(){

    }

    public void printTopFoulers(){

    }


    private ArrayList<Team> orderTeams(ArrayList<Team> listOfTeams)
    {
        if (listOfTeams.size() > 1)
        {
            int count = 0;
            while(count < listOfTeams.size()-1)
            {
                for (int i = 0; i < listOfTeams.size() -1; i++)
                {
                    double index = listOfTeams.get(i).getPoints();
                    double next = listOfTeams.get(i + 1).getPoints();
                    if (compare(index, next) == 1)
                    {
                        Team temp = listOfTeams.get(i);
                        listOfTeams.set(i, listOfTeams.get(i + 1));
                        listOfTeams.set(i + 1, temp);
                        count = 0;
                    }
                    else
                    {
                        count++;
                    }
                }
            }
        }
        return listOfTeams;
    }

    public int compare(double x, double y){
        return (x >= y)?0:1;
    }

    public ArrayList<Team> getPlacements()
    {
        ArrayList<Team> sortedArrayList;
        sortedArrayList = orderTeams(listOfTeams);
        int count =0;
            for (Team team : sortedArrayList) {
                count++;
                System.out.println(count + ". " + team.getTeamName() + " - " + team.getPoints() + " Points");
            }
        return sortedArrayList;
    }

}


