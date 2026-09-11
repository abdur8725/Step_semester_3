package practiceProblem;

public class TwoSum {
    /**
     * L1. Two Sum
     * Using two nested loops, check every pair of different positions (i, j) in the array.
     * If nums[i] + nums[j] equals target, return [i, j].
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) return new int[]{};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
