import java.util.*;

public class CoinChange {

    private static ArrayList<Integer> coinType = new ArrayList<>();

    private static Set<List<Integer>> mems = new HashSet<List<Integer>>();

    public static long change(int n, List<Long> c) {
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i) > Integer.MAX_VALUE) {
                continue;
            }
            coinType.add(c.get(i).intValue());
        }
        Collections.sort(coinType);
        for (int totalValue = 1; totalValue <= n; totalValue++) {
            Set<List<Integer>> tempMems = new HashSet<List<Integer>>();
            for (List<Integer> existedList : mems) {
                int remainValue = totalValue;
                for (Integer existedCoin : existedList) {
                    remainValue -= existedCoin;
                }
                for (int coinIndex = 0; coinIndex < coinType.size(); coinIndex++) {
                    int coinValue = coinType.get(coinIndex);
                    if (remainValue - coinValue == 0) {
                        List<Integer> newList = new ArrayList<>(existedList);
                        newList.add(coinValue);
                        Collections.sort(newList);
                        tempMems.add(newList);
                    }
                }
            }
            mems.addAll(tempMems);
            for (int coinIndex = 0; coinIndex < coinType.size(); coinIndex++) {
                int coinValue = coinType.get(coinIndex);
                if (totalValue - coinValue >= 0) {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(coinValue);
                    mems.add(newList);
                }
            }
        }
        int count = 0;
        for (List<Integer> existedList : mems) {
            int remainValue = n;
            for (Integer existedCoin : existedList) {
                remainValue -= existedCoin;
            }
            if (remainValue == 0) {
                count++;
            }
        }
        return count;
    }


    public static void init() {
        coinType = new ArrayList<>();
        mems = new HashSet<List<Integer>>();
    }
}
