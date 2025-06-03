package linkedlist;

import java.util.ArrayList;

/**
 * LeetCode #1472 - https://leetcode.com/problems/design-browser-history/
 *
 * Design a browser history that supports visiting new URLs, going back to previous URLs,
 * and going forward to future URLs.
 */

public class BrowserHistory {
    private ArrayList<String> history;
    private int currentIndex;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        currentIndex = 0;
    }

    public void visit(String url) {
        history.subList(currentIndex + 1, history.size()).clear();
        history.add(url);
        currentIndex++;
    }

    public String back(int steps) {
        currentIndex = Math.max(0, currentIndex - steps);
        return history.get(currentIndex);
    }

    public String forward(int steps) {
        currentIndex = Math.min(currentIndex + steps, history.size() - 1);
        return history.get(currentIndex);
    }
}
