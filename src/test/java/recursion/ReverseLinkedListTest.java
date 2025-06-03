package recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseLinkedListTest {

    private ReverseLinkedList.ListNode createList(int... values) {
        ReverseLinkedList.ListNode dummy = new ReverseLinkedList.ListNode(0);
        ReverseLinkedList.ListNode current = dummy;
        for (int val : values) {
            current.next = new ReverseLinkedList.ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] listToArray(ReverseLinkedList.ListNode head) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void reverseListTest() {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Example 1: [1,2,3,4,5] -> [5,4,3,2,1]
        ReverseLinkedList.ListNode head1 = createList(1, 2, 3, 4, 5);
        ReverseLinkedList.ListNode reversed1 = solution.reverseList(head1);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, listToArray(reversed1));

        // Example 2: [1,2] -> [2,1]
        ReverseLinkedList.ListNode head2 = createList(1, 2);
        ReverseLinkedList.ListNode reversed2 = solution.reverseList(head2);
        assertArrayEquals(new int[]{2, 1}, listToArray(reversed2));

        // Example 3: [] -> []
        ReverseLinkedList.ListNode head3 = createList();
        ReverseLinkedList.ListNode reversed3 = solution.reverseList(head3);
        assertArrayEquals(new int[]{}, listToArray(reversed3));
    }
}

