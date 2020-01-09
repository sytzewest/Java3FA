package com.company;

public class Normal_Goal {

    public void action(Game game, Team team, Player player) {
        player.goals++;
        //game.TeamsAndGoals.put(team, Goal); Maybe we can figure this out
        System.out.println("GOAL!!!" + game.currentTime + "th " + "Minute" + "-" + team.getTeamAbbreviation() + "-" + player.getName());
    }
}
