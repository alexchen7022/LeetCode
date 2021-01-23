public class MaximumDepthOfBinaryTree {
    int maxPath = 0;

    public int getDepth(TreeNode root) {
        if(root == null){
            return maxPath;
        }
        travel(root, 0);
        return maxPath;
    }

    public void travel(TreeNode node, int currentDepth) {
        currentDepth += 1;
        if (node.left == null && node.right == null) {
            maxPath = Math.max(maxPath, currentDepth);
        }
        if (node.left != null) {
            travel(node.left, currentDepth);
        }
        if (node.right != null) {
            travel(node.right, currentDepth);
        }
    }
}
