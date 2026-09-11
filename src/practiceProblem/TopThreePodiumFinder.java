package practiceProblem;

public class TopThreePodiumFinder {
    /**
     * Problem 3: Top-3 Podium Finder
     * Finds the top 3 scores in a single pass without sorting the array.
     * Returns top 3 scores in descending order.
     */
    public static int[] findTopThreeScores(int[] scores) {
        if (scores == null || scores.length < 3) {
            return new int[]{};
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score >= first) {
                third = second;
                second = first;
                first = score;
            } else if (score >= second) {
                third = second;
                second = score;
            } else if (score > third) {
                third = score;
            }
        }

        return new int[]{first, second, third};
    }
}
