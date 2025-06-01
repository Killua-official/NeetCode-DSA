package queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountStudentsTest {

    @Test
    void testExample1() {
        CountStudents solution = new CountStudents();
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        assertEquals(0, solution.countStudents(students, sandwiches));
    }

    @Test
    void testExample2() {
        CountStudents solution = new CountStudents();
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        assertEquals(3, solution.countStudents(students, sandwiches));
    }

    @Test
    void testAllRefuse() {
        CountStudents solution = new CountStudents();
        int[] students = {1, 1, 1};
        int[] sandwiches = {0, 0, 0};
        assertEquals(3, solution.countStudents(students, sandwiches));
    }

    @Test
    void testAllEat() {
        CountStudents solution = new CountStudents();
        int[] students = {0, 1};
        int[] sandwiches = {0, 1};
        assertEquals(0, solution.countStudents(students, sandwiches));
    }
}