package recursion;

/**
 * LeetCode #70 - https://leetcode.com/problems/climbing-stairs/
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 */

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climb(n, memo);
    }

    private int climb(int n, int[] memo) {
        if (n == 0 || n == 1) return 1;
        if (memo[n] != 0) return memo[n];
        memo[n] = climb(n - 1, memo) + climb(n - 2, memo);
        return memo[n];
    }
}

