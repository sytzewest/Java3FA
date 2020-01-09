package com.company;

public class Header extends Goal {

    public void action(Game game, Team team, Player player) {
        player.goals++;
        //game.TeamsAndGoals.put(team, Goal); Maybe we can figure this out
        System.out.println("HEADER GOAL!!!" + game.currentTime + "th " + "Minute" + "-" + team.getTeamAbbreviation() + "-" + player.getName());
    }
}
