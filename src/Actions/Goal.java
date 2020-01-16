package Actions;

import Team.Player;
import Team.Team;

public class Goal extends Action {

    @Override
    public void action(Team team, Player player) {
        player.addGoal();
        System.out.println("GOAL!!! " + team.getTeamAbbreviation() + " - " + player.getName() + " NR(" + player.getShirtNumber() + ")");
        super.action(team, player);
    }
}
