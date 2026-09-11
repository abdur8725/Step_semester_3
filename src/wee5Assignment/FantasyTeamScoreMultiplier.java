package week5Assignment;

public class FantasyTeamScoreMultiplier {
    /**
     * Problem 1: Fantasy Team Score Multiplier
     * Captain gets 2x points, Vice-Captain gets 1.5x points.
     * Modifies playerScores array directly in place.
     */
    public static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        if (playerScores == null) return;
        if (captainIndex >= 0 && captainIndex < playerScores.length) {
            playerScores[captainIndex] *= 2.0;
        }
        if (viceCaptainIndex >= 0 && viceCaptainIndex < playerScores.length) {
            playerScores[viceCaptainIndex] *= 1.5;
        }
    }
}
