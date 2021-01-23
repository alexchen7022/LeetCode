public class StockProfit {
    public int maxProfit(int[] prices) {
        int dayOfBuy = 0;
        int maxProfit = 0;
        for (int dayOfSell = 1; dayOfSell < prices.length; dayOfSell++) {
            if (prices[dayOfSell] < prices[dayOfBuy]) {
                dayOfBuy = dayOfSell;
            } else {
                maxProfit = Math.max(maxProfit, prices[dayOfSell] - prices[dayOfBuy]);
            }
        }
        return maxProfit;
    }
}
