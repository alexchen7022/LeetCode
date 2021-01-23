import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {

    private List<Long> c;
    private int n;

    @BeforeEach
    void setUp() {
        CoinChange.init();
    }

    @Test
    void case1() {
        givenCoinType(new Long[]{1L, 2L, 3L});
        givenTarget(4);
        combineSetSizeShouldBe(4L);
    }

    @Test
    void case2() {
        givenCoinType(new Long[]{8L, 2L, 3L, 1L});
        givenTarget(3);
        combineSetSizeShouldBe(3L);
    }

    @Test
    void case3() {
        givenCoinType(new Long[]{5L, 2L, 3L, 6L});
        givenTarget(10);
        combineSetSizeShouldBe(5L);
    }

    private void combineSetSizeShouldBe(long expected) {
        assertEquals(expected, CoinChange.change(n, c));
    }

    private void givenTarget(int target) {
        n = target;
    }

    private void givenCoinType(Long[] coinType) {
        c = new ArrayList<>(Arrays.asList(coinType));
    }
}
