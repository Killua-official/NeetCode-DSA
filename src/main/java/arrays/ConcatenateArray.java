package arrays;

/**
 * LeetCode #1929 - https://leetcode.com/problems/concatenation-of-array/
 *
 * Given an integer array nums of length n, return an array of length 2n
 * where the second half is a copy of the first.
 */

public class ConcatenateArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
