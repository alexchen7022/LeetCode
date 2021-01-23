import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    @Test
    void testTwoSum() {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(expected, twoSum.getResult(target, input));

    }

    /**
     * [3,2,4]
     * 6
     * Output
     * [0,0]
     * Expected
     * [1,2]
     */
    @Test
    void testTwoSumCase2() {
        int[] input = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(expected, twoSum.getResult(target, input));

    }

}
