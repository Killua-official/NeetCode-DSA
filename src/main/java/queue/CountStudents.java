package queue;

import java.util.*;

/**
 * LeetCode #1700 - https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
 *
 * Count the number of students who are unable to eat lunch
 * based on their preferences for sandwiches.
 */

public class CountStudents {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        Deque<Integer> sandwichStack = new ArrayDeque<>();

        for (int student : students) {
            studentQueue.add(student);
        }

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwichStack.push(sandwiches[i]);
        }

        int count = 0;

        while (!studentQueue.isEmpty() && !sandwichStack.isEmpty()) {
            if (studentQueue.peek() == sandwichStack.peek()) {
                studentQueue.poll();
                sandwichStack.pop();
                count = 0;
            } else {
                int student = studentQueue.poll();
                studentQueue.add(student);
                count++;
            }

            if (count == studentQueue.size()) {
                break;
            }
        }

        return studentQueue.size();
    }
}
