package arrays;

/**
 * LeetCode #27 - https://leetcode.com/problems/remove-element/
 *
 * Removes all occurrences of val from the array in-place and returns new length.
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int num : nums) {
            if (num != val) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
