package searching;

/**
 * LeetCode #278 - https://leetcode.com/problems/first-bad-version/
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one.
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 */

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
