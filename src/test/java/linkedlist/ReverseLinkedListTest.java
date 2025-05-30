package linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseLinkedListTest {

    @Test
    void testReverse_basicCase() {
        // [0 -> 1 -> 2 -> 3]
        ListNode head = new ListNode(0,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3))));

        ReverseLinkedList solver = new ReverseLinkedList();
        ListNode reversed = solver.reverseList(head);

        // [3 -> 2 -> 1 -> 0]
        assertEquals(3, reversed.val);
        assertEquals(2, reversed.next.val);
        assertEquals(1, reversed.next.next.val);
        assertEquals(0, reversed.next.next.next.val);
        assertNull(reversed.next.next.next.next);
    }

    @Test
    void testReverse_emptyList() {
        ReverseLinkedList solver = new ReverseLinkedList();
        ListNode reversed = solver.reverseList(null);
        assertNull(reversed);
    }
}

