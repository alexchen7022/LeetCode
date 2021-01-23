import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    private final Sqrt sqrt = new Sqrt();

    @Test
    void mySqrt() {
        assertEquals(2, sqrt.mySqrt(4));
    }
    @Test
    void mySqrt2() {
        assertEquals(1, sqrt.mySqrt(2));
    }
}