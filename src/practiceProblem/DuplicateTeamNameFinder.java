package practiceProblem;

public class DuplicateTeamNameFinder {
    /**
     * Problem 2: Duplicate Team Name Finder
     * Scans teamNames using nested loops and returns the first duplicate found.
     */
    public static String findDuplicateTeam(String[] teamNames) {
        if (teamNames == null) return "No Duplicates Found";
        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i] != null && teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }
}
