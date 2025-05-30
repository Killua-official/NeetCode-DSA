package stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinStackTest {

    @Test
    void testBasicOperations() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);
        minStack.push(0);

        assertEquals(0, minStack.getMin());

        minStack.pop();
        assertEquals(2, minStack.top());
        assertEquals(1, minStack.getMin());
    }

    @Test
    void testMultipleMins() {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(2);
        minStack.push(2);
        minStack.push(1);
        assertEquals(1, minStack.getMin());

        minStack.pop(); // remove 1
        assertEquals(2, minStack.getMin());

        minStack.pop(); // remove 2
        assertEquals(2, minStack.getMin());

        minStack.pop(); // remove 2
        assertEquals(3, minStack.getMin());
    }
}
