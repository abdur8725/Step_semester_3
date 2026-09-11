package practiceProblem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Category C Practice Problems Solutions (Session 5) ===");

        // Problem 1: Score Curve Booster
        System.out.println("\n--- Problem 1: Score Curve Booster ---");
        int[] scores = {70, 85, 60};
        ScoreCurveBooster.curveScores(scores, 10);
        System.out.println("Output: " + Arrays.toString(scores));

        // Problem 2: Duplicate Team Name Finder
        System.out.println("\n--- Problem 2: Duplicate Team Name Finder ---");
        String[] teams1 = {"ByteForce", "CodeCrafters", "ByteForce"};
        System.out.println("Output 1: " + DuplicateTeamNameFinder.findDuplicateTeam(teams1));
        String[] teams2 = {"ByteForce", "CodeCrafters", "NullPointers"};
        System.out.println("Output 2: " + DuplicateTeamNameFinder.findDuplicateTeam(teams2));

        // Problem 3: Top-3 Podium Finder
        System.out.println("\n--- Problem 3: Top-3 Podium Finder ---");
        int[] hackathonScores = {45, 82, 79, 90, 33, 90, 61};
        System.out.println("Output: " + Arrays.toString(TopThreePodiumFinder.findTopThreeScores(hackathonScores)));

        // Problem 4: Hackathon Seating Grid Optimizer
        System.out.println("\n--- Problem 4: Hackathon Seating Grid Optimizer ---");
        int[][] seating = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };
        System.out.println("Output: " + HackathonSeatingGridOptimizer.classifyRows(seating, 60));

        // Problem 5: Placement Drive Engine
        System.out.println("\n--- Problem 5: Placement Drive Shortlisting & Ranking Engine ---");
        PlacementDriveEngine.Candidate[] candidates = {
            new PlacementDriveEngine.Candidate("Aisha", 8.2, 40),
            new PlacementDriveEngine.Candidate("Rohit", 6.8, 65),
            new PlacementDriveEngine.Candidate("Meena", 6.0, 90),
            new PlacementDriveEngine.Candidate("Karan", 7.5, 20)
        };
        System.out.println("Output: " + PlacementDriveEngine.shortlistAndRank(candidates));
    }
}
