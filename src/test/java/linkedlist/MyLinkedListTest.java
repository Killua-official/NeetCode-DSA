package linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    void leetCodeExampleTest() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);              // [1]
        myLinkedList.addAtTail(3);              // [1, 3]
        myLinkedList.addAtIndex(1, 2);          // [1, 2, 3]
        assertEquals(2, myLinkedList.get(1));   // get(1) → 2
        myLinkedList.deleteAtIndex(1);          // [1, 3]
        assertEquals(3, myLinkedList.get(1));   // get(1) → 3
    }
}

