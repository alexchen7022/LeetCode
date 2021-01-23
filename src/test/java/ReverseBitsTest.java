import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitsTest {

    private final ReverseBits reviseBits = new ReverseBits();

    @Test
    void case1() {
        assertEquals(964176192, reviseBits.reverseBits(43261596));
    }
}
