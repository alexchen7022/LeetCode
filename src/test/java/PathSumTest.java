import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    private final PathSum pathSum = new PathSum();

    @Test
    void hasPathSum() {
        TreeNode treeNode = givenTreeNode(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});
        resultShouldBe(treeNode, true);
    }

    private void resultShouldBe(TreeNode treeNode, boolean expected) {
        assertEquals(expected, pathSum.hasPathSum(treeNode, 22));
    }

    private TreeNode givenTreeNode(Integer[] input) {
        TreeNode treeNode = TreeNode.initByArray(input);
        return treeNode;
    }
}