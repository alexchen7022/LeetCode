import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void romanToIntTest1() {
        String s = "MCMXCIV";
        assertEquals(1994, romanToInteger.toInt(s));

    }

    @Test
    void romanToIntTest2() {
        String s = "III";
        assertEquals(3, romanToInteger.toInt(s));

    }
}
