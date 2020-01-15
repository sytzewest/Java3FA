package com.company;

public class Foul extends Action {

    public void action(Team team, Player player) {
        player.fouls++;
        System.out.println("FOUL!!! " + team.getTeamAbbreviation() + "-" + player.getName());
        super.action(team, player);
    }
}
