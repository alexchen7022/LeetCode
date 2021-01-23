import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImplementStrStrTest {
    @Test
    void indexTest() {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        String haystack = "hello", needle = "ll";
        assertEquals(2, implementStrStr.index(haystack, needle));
        ;
    }
}
