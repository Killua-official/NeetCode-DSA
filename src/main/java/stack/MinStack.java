package stack;

import java.util.ArrayList;

/**
 * LeetCode #155 - https://leetcode.com/problems/min-stack/
 *
 * Stack with O(1) push, pop, top, and getMin operations.
 */

public class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);

        if (minStack.isEmpty() || val <= minStack.get(minStack.size() - 1)) {
            minStack.add(val);
        }
    }

    public void pop() {
        int top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);

        if (top == minStack.get(minStack.size() - 1)) {
            minStack.remove(minStack.size() - 1);
        }
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
