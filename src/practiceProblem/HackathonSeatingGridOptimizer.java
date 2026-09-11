package practiceProblem;

public class HackathonSeatingGridOptimizer {
    /**
     * Helper method to compute average score for a single row.
     */
    private static double rowAverage(int[] row) {
        if (row == null || row.length == 0) return 0.0;
        double sum = 0;
        for (int val : row) {
            sum += val;
        }
        return sum / row.length;
    }

    /**
     * Problem 4: Hackathon Seating Grid Optimizer
     * Classifies each seating row as "Quiet Zone" or "Buzzing Zone" based on threshold.
     */
    public static String classifyRows(int[][] seatingScores, int threshold) {
        if (seatingScores == null || seatingScores.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seatingScores.length; i++) {
            double avg = rowAverage(seatingScores[i]);
            String zone = (avg < threshold) ? "Quiet Zone" : "Buzzing Zone";
            sb.append("Row ").append(i).append(": ").append(zone);
            if (i < seatingScores.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }
}
