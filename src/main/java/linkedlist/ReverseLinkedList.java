package linkedlist;

/**
 * LeetCode #206 - Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * Reverses a singly linked list and returns the new head.
 */

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}

