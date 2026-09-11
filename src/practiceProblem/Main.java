package practiceProblem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Category C Practice Problems Solutions ===");

        // L1. Two Sum
        System.out.println("\n--- L1. Two Sum ---");
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + Arrays.toString(TwoSum.twoSum(nums1, target1)));

        // L2. Best Time to Buy and Sell Stock
        System.out.println("\n--- L2. Best Time to Buy and Sell Stock ---");
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Input: prices = " + Arrays.toString(prices1));
        System.out.println("Output: " + BestTimeToBuyAndSellStock.maxProfit(prices1));

        // L3. Contains Duplicate
        System.out.println("\n--- L3. Contains Duplicate ---");
        int[] numsDup = {1, 2, 3, 1};
        System.out.println("Input: nums = " + Arrays.toString(numsDup));
        System.out.println("Output: " + ContainsDuplicate.containsDuplicate(numsDup));

        // L4. Merge Two Sorted Arrays
        System.out.println("\n--- L4. Merge Two Sorted Arrays ---");
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println("Input: arr1 = " + Arrays.toString(arr1) + ", arr2 = " + Arrays.toString(arr2));
        System.out.println("Output: " + Arrays.toString(MergeTwoSortedArrays.mergeSortedArrays(arr1, arr2)));

        // L5. Rotate Array
        System.out.println("\n--- L5. Rotate Array ---");
        int[] rotateNums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Input: nums = " + Arrays.toString(rotateNums) + ", k = " + k);
        System.out.println("Output: " + Arrays.toString(RotateArray.rotateArray(rotateNums, k)));
    }
}
