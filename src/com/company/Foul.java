package com.company;

public class Foul implements Timeable {

    public void action(Game game, Team team, Player player) {
        player.fouls++;
        //game.TeamsAndFouls.put(team, Goal); Maybe we can figure this out
        System.out.println("FOUL!!!" + game.currentTime + "th " + "Minute" + "-" + team.getTeamAbbreviation() + "-" + player.getName());
    }
}
