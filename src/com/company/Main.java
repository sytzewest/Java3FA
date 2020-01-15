package com.company;

public class Main {

    public static void main(String[] args) {

        Player bob = new Player("Bob", 5);
        Player ooo = new Player("aaa", 2);
        Player rrr = new Player("rrr", 18);
        Player hhh = new Player("hhh", 11);

        Team team = new Team("One", "yay");
        Team team2 = new Team("Two", "popo");

        team.listOfPlayers.add(bob);
        team.listOfPlayers.add(ooo);
        team2.listOfPlayers.add(rrr);
        team2.listOfPlayers.add(hhh);

        Table one = new Table("Eredivisie");
        one.listOfTeams.add(team);
        one.listOfTeams.add(team2);

        Goal goal1 = new Goal();
        Goal goal2 = new Goal();
        Goal goal3 = new Goal();

        Game game = new Game(team,team2);
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        goal1.action(team,bob);
        game.listofActions.add(goal1);
        game.getGoalsOf(team2);
        game.nextMinute();
        goal2.action(team2,rrr);
        game.listofActions.add(goal2);
        game.nextMinute();
        goal3.action(team,bob);
        game.listofActions.add(goal3);
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.nextMinute();
        game.getWinner(team, team2);

        one.printTable();
        one.printMostGoals();
    }
}
