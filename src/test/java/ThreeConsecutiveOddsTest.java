import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeConsecutiveOddsTest {

    private final ThreeConsecutiveOdds threeConsecutiveOdds = new ThreeConsecutiveOdds();

    @Test
    void case1() {
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        assertEquals(true, threeConsecutiveOdds.check(arr));
    }
}
