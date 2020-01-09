package com.company;

public class Main {

    public static void main(String[] args) {
        Team Bob = new Team("Bob", 5);
        Team aaa = new Team("aaa", 6);
        Team bbb = new Team("bbb", 1);

        Table one = new Table();
        one.listOfTeams.add(Bob);
        one.listOfTeams.add(aaa);
        one.listOfTeams.add(bbb);
        one.getPlacements();
    }
}
