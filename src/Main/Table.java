package Main;

import Interfaces.Sortable;
import Team.Team;
import Team.Player;

import java.util.ArrayList;

public class Table {
    ArrayList<Team> listOfTeams;
    String leagueName;

    public Table(String leagueName)
    {
        this.leagueName = leagueName;
        listOfTeams = new ArrayList<>();

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

    public ArrayList<Player> getListOfPlayers(){
        ArrayList<Player> listOfPlayers = new ArrayList<>();
        for (Team team : listOfTeams){
            listOfPlayers.addAll(team.listOfPlayers);
        }
        return listOfPlayers;
    }

    public void printTable()
    {
        PrintData(toSortableList(listOfTeams));
    }

    public void printMostGoals(){
        PrintData(toSortableList(getListOfPlayers()));
    }

    private void PrintData(ArrayList<Sortable> sortables) {
        ArrayList<Sortable> sortedArrayList;
        sortedArrayList = sortItems(sortables);

        System.out.println(getLeagueName());
        int count =0;
        for (Sortable item: sortedArrayList) {
            count++;
            System.out.println(count + ". " + item.getDescription());
        }
        System.out.println(sortedArrayList);
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public void printListOfPlayersInTeam(Team team) {
        System.out.println("A list of all current players in: " +team.getTeamName());
        System.out.println("----------------");

        for (Player player : team.listOfPlayers) {
            System.out.println("Player Name: " + player.getName());
            System.out.println("Player Shirt Number: " + player.getShirtNumber());
            System.out.println("----------------");
        }
        System.out.println(" ");
    }
}


