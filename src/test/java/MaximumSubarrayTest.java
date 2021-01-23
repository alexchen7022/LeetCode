import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {

    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    void case1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, maximumSubarray.maxSubArray(nums));;
    }
    @Test
    void case2() {
        int[] nums = {1,2};
        assertEquals(3, maximumSubarray.maxSubArray(nums));;
    }

}
