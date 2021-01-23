import java.util.ArrayList;
import java.util.List;

public class CountAndSay {
    public String say(int n) {
        String pervious = "1";
        if (n == 1) {
            return pervious;
        }

        for (int i = 2; i <= n; i++) {
            pervious = count(pervious);
        }
        return pervious;
    }

    public String count(String s) {
        String[] chars = s.split("");
        StringBuilder sb = new StringBuilder();
        String current = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (current.equals(chars[i])) {
                count += 1;
            } else {
                if (count != 0) {
                    sb.append(count);
                    sb.append(current);
                }
                count = 1;
                current = chars[i];
            }
        }
        if (count != 0) {
            sb.append(count);
            sb.append(current);
        }
        return sb.toString();
    }
}
