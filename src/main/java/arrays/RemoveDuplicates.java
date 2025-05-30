package arrays;

import java.util.TreeSet;

/**
 * LeetCode #26 - Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Removes duplicates in-place from a sorted array.
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> unique = new TreeSet<>();
        for (int num : nums) {
            unique.add(num);
        }

        int i = 0;
        for (int num : unique) {
            nums[i++] = num;
        }

        return unique.size();
    }
}

