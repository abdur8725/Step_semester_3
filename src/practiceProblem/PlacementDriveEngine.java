package practiceProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlacementDriveEngine {

    public static class Candidate implements Comparable<Candidate> {
        private String name;
        private double cgpa;
        private int codingScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        public String getName() {
            return name;
        }

        public double getCgpa() {
            return cgpa;
        }

        public int getCodingScore() {
            return codingScore;
        }

        public double getCompositeScore() {
            return (cgpa * 10.0) + codingScore;
        }

        /**
         * Overloaded eligibility check: CGPA-only filter (threshold >= 7.5).
         */
        public static boolean isEligible(double cgpa) {
            return cgpa >= 7.5;
        }

        /**
         * Overloaded eligibility check: Combined CGPA and coding score filter (CGPA >= 6.5 and codingScore >= 60).
         */
        public static boolean isEligible(double cgpa, int codingScore) {
            return cgpa >= 6.5 && codingScore >= 60;
        }

        @Override
        public int compareTo(Candidate other) {
            // Descending order by composite score
            return Double.compare(other.getCompositeScore(), this.getCompositeScore());
        }
    }

    /**
     * Problem 5: Shortlist candidates and rank them in descending order of composite score.
     */
    public static String shortlistAndRank(Candidate[] candidates) {
        if (candidates == null || candidates.length == 0) {
            return "";
        }

        List<Candidate> shortlisted = new ArrayList<>();
        for (Candidate c : candidates) {
            if (Candidate.isEligible(c.getCgpa()) || Candidate.isEligible(c.getCgpa(), c.getCodingScore())) {
                shortlisted.add(c);
            }
        }

        Candidate[] shortlistedArr = shortlisted.toArray(new Candidate[0]);
        Arrays.sort(shortlistedArr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortlistedArr.length; i++) {
            Candidate c = shortlistedArr[i];
            sb.append(i + 1).append(". ")
              .append(c.getName()).append(" (")
              .append(String.format("%.1f", c.getCompositeScore())).append(")");
            if (i < shortlistedArr.length - 1) {
                sb.append(" | ");
            }
        }

        return sb.toString();
    }
}
