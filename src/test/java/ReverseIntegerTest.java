import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {
    @Test
    void reviseInteger() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 123;
        assertEquals(321, reverseInteger.revise(x));

    }

    @Test
    void reviseInteger1() {
        ReverseInteger reverseInteger = new ReverseInteger();
        long x = -123;
        assertEquals(-321, reverseInteger.revise(x));

    }

    @Test
    void reviseInteger2() {
        ReverseInteger reverseInteger = new ReverseInteger();
        long x = 9646324351L;
        assertEquals(1534236469, reverseInteger.revise(x));

    }


}
