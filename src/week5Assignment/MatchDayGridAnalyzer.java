package week5Assignment;

public class MatchDayGridAnalyzer {
    private static double rowAverage(int[] row) {
        if (row == null || row.length == 0) return 0.0;
        double sum = 0;
        for (int val : row) {
            sum += val;
        }
        return sum / row.length;
    }

    /**
     * Problem 4: Match Day Grid Analyzer
     * Classifies each match as "Power Surge" if row average >= threshold, else "Normal".
     */
    public static String classifyMatches(int[][] runsPerOver, int threshold) {
        if (runsPerOver == null || runsPerOver.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < runsPerOver.length; i++) {
            double avg = rowAverage(runsPerOver[i]);
            String status = (avg >= threshold) ? "Power Surge" : "Normal";
            sb.append("Match ").append(i).append(": ").append(status);
            if (i < runsPerOver.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }
}
