package linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortedLinkedListTest {

    @Test
    void testMergeTwoLists_basicCase() {
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        SortedLinkedList merger = new SortedLinkedList();
        ListNode result = merger.mergeTwoLists(list1, list2);

        int[] expected = {1, 2, 3, 4, 5, 6};
        for (int value : expected) {
            assertNotNull(result);
            assertEquals(value, result.val);
            result = result.next;
        }

        assertNull(result);
    }

    @Test
    void testMergeTwoLists_emptyInput() {
        SortedLinkedList merger = new SortedLinkedList();
        assertNull(merger.mergeTwoLists(null, null));
    }
}
