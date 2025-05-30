package stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    @Test
    void testValidSimple() {
        ValidParentheses sol = new ValidParentheses();
        assertTrue(sol.isValid("[]"));
    }

    @Test
    void testValidNested() {
        ValidParentheses sol = new ValidParentheses();
        assertTrue(sol.isValid("([{}])"));
    }

    @Test
    void testInvalidOrder() {
        ValidParentheses sol = new ValidParentheses();
        assertFalse(sol.isValid("[(])"));
    }

    @Test
    void testOnlyOpening() {
        ValidParentheses sol = new ValidParentheses();
        assertFalse(sol.isValid("[["));
    }
}
