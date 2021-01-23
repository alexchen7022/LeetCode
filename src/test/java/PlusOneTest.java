import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusOneTest {

    private final PlusOne plusOne = new PlusOne();

    @Test
    void addOne() {
        int[] input = {9, 9, 9, 9};
        int[] expected = {1, 0, 0, 0, 0};
        assertArrayEquals(expected, plusOne.addOne(input));
    }

    @Test
    void addOneCase2() {
        int[] input = {9, 9, 9, 7};
        int[] expected = {9, 9, 9, 8};
        assertArrayEquals(expected, plusOne.addOne(input));
    }
}
