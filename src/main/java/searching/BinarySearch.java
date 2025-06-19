package searching;

/**
 * LeetCode #704 - https://leetcode.com/problems/binary-search/
 *
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * return the index of target if it is in the array. Otherwise, return -1.
 *
 * The algorithm must run in O(log n) time.
 */

public class BinarySearch {

    public int search(int[] nums, int target) {
        int L = 0, R = nums.length - 1;
        int mid;

        while (L <= R) {
            mid = (L + R) / 2;

            if (target > nums[mid]) {
                L = mid + 1;
            } else if (target < nums[mid]) {
                R = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
