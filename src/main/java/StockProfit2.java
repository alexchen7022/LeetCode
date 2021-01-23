public class StockProfit2 {
    public int maxProfit(int[] prices) {
        int dayOfBuy = 0;
        int maxProfit = 0;

        for (int dayOfSell = 1; dayOfSell < prices.length; dayOfSell++) {
            if (prices[dayOfSell] > prices[dayOfBuy]) {
                maxProfit += prices[dayOfSell] - prices[dayOfBuy];
            }
            dayOfBuy = dayOfSell;
        }
        return maxProfit;
    }
}