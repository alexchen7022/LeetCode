import java.util.HashMap;

public class RomanToInteger {

    private final HashMap<String, Integer> lookup = new HashMap<String, Integer>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    public int toInt(String s) {
        String[] chars = s.split("");
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            int current = lookup.get(chars[i]);
            int next = 0;
            if (i + 1 < chars.length) {
                next = lookup.get(chars[i + 1]);
            }
            if (current >= next) {
                sum += current;
            } else {
                sum -= current;
            }
        }
        return sum;
    }
}
