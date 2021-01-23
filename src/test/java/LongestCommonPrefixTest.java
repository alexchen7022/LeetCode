import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    private final longestCommonPrefix longestCommonPrefix = new longestCommonPrefix();

    @Test
    void longestCommonPrefixTest() {
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.getlongestCommonPrefix(strs));
    }
}
