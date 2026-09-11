package week5Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FantasyLeagueAutoDraft {

    public static class Player implements Comparable<Player> {
        private String name;
        private int matchesPlayed;
        private double battingAverage;
        private boolean injured;

        public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        public String getName() {
            return name;
        }

        public int getMatchesPlayed() {
            return matchesPlayed;
        }

        public double getBattingAverage() {
            return battingAverage;
        }

        public boolean isInjured() {
            return injured;
        }

        public static boolean isDraftable(int matchesPlayed) {
            return matchesPlayed >= 10;
        }

        public static boolean isDraftable(int matchesPlayed, boolean injured) {
            return matchesPlayed >= 5 && !injured;
        }

        @Override
        public int compareTo(Player other) {
            return Double.compare(other.battingAverage, this.battingAverage);
        }
    }

    /**
     * Problem 5: Fantasy League Auto-Draft Ranking Engine
     * Filters draftable players and ranks them in descending order of batting average.
     */
    public static String draftAndRank(Player[] players) {
        if (players == null || players.length == 0) {
            return "";
        }
        List<Player> draftable = new ArrayList<>();
        for (Player p : players) {
            if (Player.isDraftable(p.getMatchesPlayed()) || Player.isDraftable(p.getMatchesPlayed(), p.isInjured())) {
                draftable.add(p);
            }
        }
        Player[] draftableArr = draftable.toArray(new Player[0]);
        Arrays.sort(draftableArr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < draftableArr.length; i++) {
            sb.append(i + 1).append(". ").append(draftableArr[i].getName());
            if (i < draftableArr.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }
}
