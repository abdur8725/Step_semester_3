package week5Assignment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Category C Assignment Problems Solutions (Week 5) ===");

        // Problem 1: Fantasy Team Score Multiplier
        System.out.println("\n--- Problem 1: Fantasy Team Score Multiplier ---");
        double[] scores = {40, 55, 30, 62};
        FantasyTeamScoreMultiplier.applyMultipliers(scores, 1, 3);
        System.out.println("Output: " + Arrays.toString(scores));

        // Problem 2: Duplicate Player Pick Checker
        System.out.println("\n--- Problem 2: Duplicate Player Pick Checker ---");
        String[] lineup1 = {"Kohli", "Bumrah", "Kohli", "Rohit"};
        System.out.println("Output 1: " + DuplicatePlayerPickChecker.findDuplicatePick(lineup1));
        String[] lineup2 = {"Kohli", "Bumrah", "Rohit"};
        System.out.println("Output 2: " + DuplicatePlayerPickChecker.findDuplicatePick(lineup2));

        // Problem 3: Top Performer Tracker
        System.out.println("\n--- Problem 3: Top Performer Tracker ---");
        int[] scores3 = {45, 82, 79, 90, 33, 90, 61};
        System.out.println("Output: " + TopPerformerTracker.findMinMaxSpread(scores3));

        // Problem 4: Match Day Grid Analyzer
        System.out.println("\n--- Problem 4: Match Day Grid Analyzer ---");
        int[][] runsPerOver = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };
        System.out.println("Output: " + MatchDayGridAnalyzer.classifyMatches(runsPerOver, 8));

        // Problem 5: Fantasy League Auto-Draft Ranking Engine
        System.out.println("\n--- Problem 5: Fantasy League Auto-Draft Ranking Engine ---");
        FantasyLeagueAutoDraft.Player[] players = {
            new FantasyLeagueAutoDraft.Player("Virat", 15, 48.0, false),
            new FantasyLeagueAutoDraft.Player("Rahul", 7, 55.0, false),
            new FantasyLeagueAutoDraft.Player("Sameer", 3, 60.0, false),
            new FantasyLeagueAutoDraft.Player("Dev", 12, 20.0, true)
        };
        System.out.println("Output: " + FantasyLeagueAutoDraft.draftAndRank(players));
    }
}
