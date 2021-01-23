import org.junit.jupiter.api.Test;
import sun.lwawt.macosx.CInputMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedArrayToBSTTest {
    @Test
    void case1() {
        SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
        int[] nums = {-10, -3, 0, 5, 9};
        Integer[] input = {0, -3, 9, -10, null, 5, null};
        TreeNode expected = TreeNode.initByArray(input);
        assertEquals(expected, sortedArrayToBST.createTree(nums));
    }
}
