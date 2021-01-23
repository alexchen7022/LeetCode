import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeLevelOrderTravelTest {
    @Test
    void case1() {
        BinaryTreeLevelOrderTravel binaryTreeLevelOrderTravel = new BinaryTreeLevelOrderTravel();
        List<List<Integer>> expected = new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{
                add(15);
                add(7);
            }});
            add(new ArrayList<Integer>() {{
                add(9);
                add(20);
            }});
            add(new ArrayList<Integer>() {{
                add(3);
            }});
        }};

        TreeNode node = TreeNode.initByArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertEquals(expected, binaryTreeLevelOrderTravel.levelOrderBottom(node));
    }
}
