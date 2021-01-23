import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockProfit2Test {
    private final StockProfit2 stockProfit = new StockProfit2();

    @Test
    void case1() {
        int[] prices= {7,1,5,3,6,4};
        profitShouldBe(prices, 7);
    }
    @Test
    void case2() {
        int[] prices= {7,6,4,3,1};
        profitShouldBe(prices, 0);
    }
    @Test
    void case3() {
        int[] prices= {1,2,3,4,5};
        profitShouldBe(prices, 4);
    }

    private void profitShouldBe(int[] prices, int expected) {
        assertEquals(expected, stockProfit.maxProfit(prices));
    }
}
