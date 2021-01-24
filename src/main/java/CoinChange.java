import java.util.*;

public class CoinChange {

    public static long change(int n, List<Long> c) {
        Collections.sort(c);
        int[] coins = new int[c.size()];
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i) > Integer.MAX_VALUE) {
                continue;
            }
            coins[i] = c.get(i).intValue();
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= n; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[n];
    }

}
