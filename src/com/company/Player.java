package com.company;

public class Player implements Sortable {
    String name = "";
    int shirtNumber = 0;
    int goals = 0;
    int fouls = 0;

    public Player(String name, int shirtNumber){
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.goals = goals;
        this.fouls = fouls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    @Override
    public int getSortableValue() {
        return goals;
    }

    @Override
    public String getDescription() {
        return getName() + " - " + getGoals() + " Goals";
    }

    @Override
    public String toString() {
        return name + ": " + goals + " goals";
    }

}
