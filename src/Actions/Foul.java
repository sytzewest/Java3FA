package Actions;

import Team.Player;
import Team.Team;

public class Foul extends Action {

    public void action(Team team, Player player) {
        player.addFoul();
        System.out.println("FOUL!!! " + team.getTeamAbbreviation() + "-" + player.getName());
        super.action(team, player);
    }
}
