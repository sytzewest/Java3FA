package com.company;

public class Foul extends Action {

    public void action(Team team, Player player) {
        player.fouls++;
        //game.TeamsAndFouls.put(team, Foul); Maybe we can figure this out
    }

    public void printAction(){
       // System.out.println("FOUL!!!" + game.currentTime + "th " + "Minute" + "-" + team.getTeamAbbreviation() + "-" + player.getName());
    }

    @Override
    public void action(Game game, Team team, Player player) {

    }
}
