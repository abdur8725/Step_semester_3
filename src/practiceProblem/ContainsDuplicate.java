package practiceProblem;

public class ContainsDuplicate {
    /**
     * L3. Contains Duplicate
     * Using two nested loops, compare every element at position i against position j.
     * Return true if any duplicate is found, false otherwise.
     */
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null) return false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
