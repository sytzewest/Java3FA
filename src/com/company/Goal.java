package com.company;

public abstract class Goal implements Timeable{

    public abstract void action(Game game, Team team, Player player);
}
