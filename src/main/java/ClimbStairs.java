import java.util.HashMap;

public class ClimbStairs {

    private final HashMap<Integer, Integer> lookup = new HashMap<Integer,Integer>() {{
        put(0, 0);
        put(1, 1);
        put(2, 2);
    }};

    public int getPath(int n) {
        if (lookup.get(n) != null) {
            return lookup.get(n);
        }
        int ans = getPath(n - 1) + getPath(n - 2);
        lookup.put(n, ans);
        return ans;
    }
}
