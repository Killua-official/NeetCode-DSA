package linkedlist;

/**
 * LeetCode #707 - Design Linked List
 * https://leetcode.com/problems/design-linked-list/
 *
 * Design your implementation of the linked list. (I choose to implement a doubly linked list.)
 */

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private class Node {
        int val;
        Node prev;
        Node next;

        Node (int val) {
            this.val = val;
        }
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        Node current = head;
        for (int i = 0; i < index; i ++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size ++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size ++;
    }

    public void addAtIndex(int index, int val) {
        if (index == size) {
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        } else if (index > size) {
            return;
        } else {
            Node current = head;
            for (int i = 0; i < index; i ++) {
                current = current.next;
            }
            Node prev = current.prev;
            Node newNode = new Node(val);

            prev.next = newNode;
            newNode.prev = prev;

            newNode.next = current;
            current.prev = newNode;

            size ++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size){
            return;
        } else if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (index == size - 1) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node prev = current.prev;
            Node next = current.next;

            prev.next = next;
            next.prev = prev;
        }
        size --;
    }
}
