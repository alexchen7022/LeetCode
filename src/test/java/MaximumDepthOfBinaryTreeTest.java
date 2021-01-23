import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    void case1() {
        TreeNode root = givenNode(new Integer[]{3,9,20,null,null,15,7});
        depthShouldbe(root, 3);
    }
    @Test
    void case2() {
        TreeNode root = givenNode(new Integer[]{1,null,2});
        depthShouldbe(root, 2);
    }
    @Test
    void case3() {
        TreeNode root = givenNode(new Integer[]{});
        depthShouldbe(root, 0);
    }
    @Test
    void case4() {
        TreeNode root = givenNode(new Integer[]{0});
        depthShouldbe(root, 1);
    }

    private void depthShouldbe(TreeNode root, int expected) {
        assertEquals(expected, maximumDepthOfBinaryTree.getDepth(root));
    }

    private TreeNode givenNode(Integer[] input) {
        TreeNode root = TreeNode.initByArray(input);
        return root;
    }
}
