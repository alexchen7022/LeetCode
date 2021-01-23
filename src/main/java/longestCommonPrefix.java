import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class longestCommonPrefix {
    public String getlongestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs == null || strs.length == 0) {
            return prefix;
        }
        Arrays.sort(strs, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();// comparision
            }
        });
        prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
