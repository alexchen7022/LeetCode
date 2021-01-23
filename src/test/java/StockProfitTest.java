import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockProfitTest {

    private final StockProfit stockProfit = new StockProfit();

    @Test
    void case1() {
        int[] prices= {7,1,5,3,6,4};
        profitShouldBe(prices, 5);
    }
    @Test
    void case2() {
        int[] prices= {7,6,4,3,1};
        profitShouldBe(prices, 0);
    }

    private void profitShouldBe(int[] prices, int expected) {
        assertEquals(expected, stockProfit.maxProfit(prices));
    }
}
