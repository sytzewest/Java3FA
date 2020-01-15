package com.company;

public class Goal extends Action {

    @Override
    public void action(Team team, Player player) {
        player.goals++;
        System.out.println("GOAL!!! " + team.getTeamAbbreviation() + " - " + player.getName() + " NR(" + player.getShirtNumber() + ")");
        super.action(team, player);
    }
}
