package Team;

import Main.TeamTooFullException;
import Team.Player;
import Interfaces.Sortable;

import java.util.ArrayList;

public class Team implements Sortable {
    private int points = 0;
    private int wins = 0;
    private int draws = 0;
    private int losses = 0;
    private int maxTeamSize = 5;
    private String teamName = "";
    private String teamAbbreviation;
    public ArrayList<Player> listOfPlayers;

    public Team(String teamName, String teamAbbreviation){
        this.teamName = teamName;
        this.teamAbbreviation = teamAbbreviation;
        listOfPlayers = new ArrayList<>();
    }

    public void addPoints(int point) {
        points = points + point;
    }

    public void addWin() {
        wins = wins + 1;
    }

    public void addLoss() {
        losses = losses + 1;
    }

    public void addDraw() {
        draws = draws + 1;
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

    public int getTeamSize() {
        return listOfPlayers.size();
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

    public void printPlayersStats(Player player) {
            System.out.println("Player Name: " + player.getName());
            System.out.println("Player Goals: " + player.getGoals());
            System.out.println("Player Fouls: " + player.getFouls());
            System.out.println("Player Shirt Number: " + player.getShirtNumber());
    }

    public void addPlayerToTeam(Player player) throws TeamTooFullException {
        try{
            if(listOfPlayers.size()<maxTeamSize) {
                listOfPlayers.add(player);
            }
        } catch (Exception e){
            throw new TeamTooFullException("Team is too full, select a different team.");
        }
    }


}
