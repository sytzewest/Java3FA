package com.company;

public class Goal extends Action implements Sortable {

    public void action(Team team, Player player) {
        player.goals++;
    }

    public void printAction(){
       // System.out.println("GOAL!!!" + game.currentTime + "th " + "Minute" + "-" + team.getTeamAbbreviation() + "-" + player.getName());
    }

    @Override
    public int getSortableValue() {
        return  ;
    }

    @Override
    public void action(Game game, Team team, Player player) {

    }
}
