import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {

    private final CountAndSay countAndSay = new CountAndSay();

    @Test
    void say() {
        assertEquals("13211311123113112211", countAndSay.say(10));
    }
}