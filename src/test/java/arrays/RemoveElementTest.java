package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class RemoveElementTest {

    @Test
    void testRemoveElement_case1() {
        RemoveElement sol = new RemoveElement();
        int[] nums = {1, 1, 2, 3, 4};
        int k = sol.removeElement(nums, 1);

        assertEquals(3, k);
        int[] expected = {2, 3, 4};
        assertArrayEquals(expected, Arrays.copyOf(nums, k));
    }

    @Test
    void testRemoveElement_case2() {
        RemoveElement sol = new RemoveElement();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int k = sol.removeElement(nums, 2);

        assertEquals(5, k);
        int[] expected = {0, 1, 3, 0, 4};
        assertArrayEquals(expected, Arrays.copyOf(nums, k));
    }
}
