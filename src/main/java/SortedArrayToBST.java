public class SortedArrayToBST {
    public TreeNode createTree(int[] nums) {

        return createNode(nums, nums.length - 1, 0);
    }

    public TreeNode createNode(int[] nums, int hight, int low) {
        if (hight < 0 || low < 0 || hight < low) {
            return null;
        }
        int mid = hight - low == 1 ? hight : (hight + low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createNode(nums, mid - 1, low);
        node.right = createNode(nums, hight, mid + 1);
        return node;
    }
}
