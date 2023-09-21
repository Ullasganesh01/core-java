package com.xworkz.team_players;

import com.xworkz.team_players.players.Player;
import com.xworkz.team_players.team.Team;

public class TeamPlayerTester {
    public static void main(String[] args) {
        Team team = new Team();
        Player player = new Player();
        team.player = player;
    }
}
