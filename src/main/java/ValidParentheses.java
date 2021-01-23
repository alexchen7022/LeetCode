import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        HashMap<String, String> pairLoockup = new HashMap<String, String>() {{
            put("{", "}");
            put("[", "]");
            put("(", ")");
        }};
        Stack<String> stackOfPair = new Stack<>();
        String[] splitInput = s.split("");
        for (String input : splitInput) {
            String currentPair = pairLoockup.get(input);
            if (currentPair == null) {
                if (stackOfPair.size() == 0) {
                    return false;
                }
                String expectedString = stackOfPair.pop();
                if (!expectedString.equals(input)) {
                    return false;
                }
            } else {
                stackOfPair.push(currentPair);
            }
        }
        if (stackOfPair.size() != 0) {
            return false;
        }
        return true;
    }
}
