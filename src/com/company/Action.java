package com.company;

public abstract class Action implements Timeable{
    private Team team;
    private Player player;

    public abstract void action(Team team, Player player);

    public abstract void printAction();

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
