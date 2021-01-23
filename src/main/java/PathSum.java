public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return getSum(root, 0, sum);

    }

    private boolean getSum(TreeNode node, int preSum, int sum) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            if (node.val + preSum == sum) {
                return true;
            }
        }
        if (node.left != null) {
            if (getSum(node.left, preSum + node.val, sum)) {
                return true;
            }
        }
        if (node.right != null) {
            if (getSum(node.right, preSum + node.val, sum)) {
                return true;
            }
        }
        return false;
    }
}
