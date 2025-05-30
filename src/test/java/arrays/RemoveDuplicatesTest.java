package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates_basicCase() {
        RemoveDuplicates sol = new RemoveDuplicates();
        int[] nums = {1, 1, 2, 3, 3};
        int k = sol.removeDuplicates(nums);

        assertEquals(3, k);
        assertArrayEquals(new int[] {1, 2, 3}, java.util.Arrays.copyOf(nums, k));
    }
}
