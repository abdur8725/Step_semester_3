package practiceProblem;

import java.util.Arrays;

public class ScoreCurveBooster {
    /**
     * Problem 1: Hackathon Score Curve Booster
     * Modifies the caller's original array directly in place by adding bonus to every score.
     * Returns nothing.
     */
    public static void curveScores(int[] scores, int bonus) {
        if (scores == null) return;
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }
}
