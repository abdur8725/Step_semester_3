package week5Assignment;

public class TopPerformerTracker {
    /**
     * Problem 3: Top Performer Tracker
     * Finds min, max, and spread in a single pass without sorting.
     */
    public static String findMinMaxSpread(int[] scores) {
        if (scores == null || scores.length == 0) {
            return "Min: 0 | Max: 0 | Spread: 0";
        }
        int min = scores[0];
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        int spread = max - min;
        return "Min: " + min + " | Max: " + max + " | Spread: " + spread;
    }
}
