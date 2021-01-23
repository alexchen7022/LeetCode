import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordTest {

    private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    void case1() {
        String s=" ";
        assertEquals(0, lengthOfLastWord.getLength(s));
    }
    @Test
    void case2() {
        String s="Hello World";
        assertEquals(5, lengthOfLastWord.getLength(s));
    }

}
