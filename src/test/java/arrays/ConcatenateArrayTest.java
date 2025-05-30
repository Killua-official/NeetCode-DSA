package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcatenateArrayTest {

    @Test
    void testExample1() {
        ConcatenateArray sol = new ConcatenateArray();
        int[] nums = {1, 4, 1, 2};
        int[] expected = {1, 4, 1, 2, 1, 4, 1, 2};

        assertArrayEquals(expected, sol.getConcatenation(nums));
    }

    @Test
    void testExample2() {
        ConcatenateArray sol = new ConcatenateArray();
        int[] nums = {22, 21, 20, 1};
        int[] expected = {22, 21, 20, 1, 22, 21, 20, 1};

        assertArrayEquals(expected, sol.getConcatenation(nums));
    }
}
