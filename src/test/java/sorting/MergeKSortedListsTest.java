package sorting;

public class MergeKSortedListsTest {

    public static void main(String[] args) {
        MergeKSortedLists solution = new MergeKSortedLists();

        // Example 1:
        MergeKSortedLists.ListNode[] lists1 = new MergeKSortedLists.ListNode[]{
                createList(new int[]{1, 4, 5}),
                createList(new int[]{1, 3, 4}),
                createList(new int[]{2, 6})
        };
        printList(solution.mergeKLists(lists1)); // Expected: 1->1->2->3->4->4->5->6

        // Example 2:
        MergeKSortedLists.ListNode[] lists2 = new MergeKSortedLists.ListNode[]{};
        printList(solution.mergeKLists(lists2)); // Expected: null

        // Example 3:
        MergeKSortedLists.ListNode[] lists3 = new MergeKSortedLists.ListNode[]{null};
        printList(solution.mergeKLists(lists3)); // Expected: null
    }

    private static MergeKSortedLists.ListNode createList(int[] values) {
        MergeKSortedLists.ListNode dummy = new MergeKSortedLists.ListNode(0);
        MergeKSortedLists.ListNode current = dummy;
        for (int val : values) {
            current.next = new MergeKSortedLists.ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private static void printList(MergeKSortedLists.ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null) System.out.print(" -> ");
        }
        System.out.println();
    }
}

