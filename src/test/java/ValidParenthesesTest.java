import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValid() {
        String s = "()";
        assertEquals(true, validParentheses.isValid(s));
    }

    @Test
    void isValid1() {
        String s = "{[]}";
        assertEquals(true, validParentheses.isValid(s));
    }

    @Test
    void isValid2() {
        String s = "[";
        assertEquals(false, validParentheses.isValid(s));
    }
}
