package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class BaseBallTeam {
    private String teamName;

    private List<BaseBallPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseBallTeam(String teamName) {
        this.teamName = teamName;

    }

    public void addPlayer(BaseBallPlayer baseBallPlayer) {
        if (!teamMembers.contains(baseBallPlayer)) {
            teamMembers.add(baseBallPlayer);
        }
    }

    public void listPlayers() {
        System.out.println(teamName + "Roaster:");
        System.out.println(teamMembers);

    }

    public int ranking() {
        return (totalWins * 2) + totalTies + 1;
    }
    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied with";
        } else if (ourScore < theirScore) {
            totalLosses++;
            message = "lost to";
        }
        return message;
    }

        @Override
        public String toString() {
            return teamName+"(Ranked"+ ranking()+")";
        }
    }

