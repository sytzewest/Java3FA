package com.company;

import java.util.ArrayList;


public class Table {
    ArrayList<Team> listOfTeams;
    ArrayList<Player> listOfPlayers;
    int maxPoints = -1;


    public Table(){
        listOfTeams = new ArrayList<>();
        listOfPlayers = new ArrayList<>();
    }

   /* public ArrayList<Player> getTopScorer(){
    } */

    public void printTopFoulers(){

    }


    private ArrayList<Sortable> sortItems(ArrayList<Sortable> list)
    {
        if (list.size() > 1)
        {
            int count = 0;
            while(count < list.size()-1)
            {
                for (int i = 0; i < list.size() -1; i++)
                {
                    double index = list.get(i).getSortableValue();
                    double next = list.get(i + 1).getSortableValue();
                    if (compare(index, next) == 1)
                    {
                        Sortable temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                        count = 0;
                    }
                    else
                    {
                        count++;
                    }
                }
            }
        }
        return list;
    }

    private ArrayList<Sortable> toSortableList(ArrayList list) {
        ArrayList<Sortable> result = new ArrayList<>();
        for (Object item : list) {
            result.add(Sortable.class.cast(item));
        }
        return result;
    }

    public int compare(double x, double y){
        return (x >= y)?0:1;
    }

    public void printTable()
    {
        ArrayList<Sortable> sortedArrayList;
        sortedArrayList = sortItems(toSortableList(listOfTeams));
        int count =0;
            for (Team team: sortedArrayList) {
                count++;
                System.out.println(count + ". " + team.getTeamName() + " - " + team.getPoints() + " Points");
            }
        System.out.println(sortedArrayList);
    }
}


