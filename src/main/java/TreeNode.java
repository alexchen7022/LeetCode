import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode initByArray(Integer[] input) {
        if (input.length == 0) {
            return null;
        }
        TreeNode head = new TreeNode(input[0]);
        if (input.length == 1) {
            return head;
        }
        List<TreeNode> nodeList = new ArrayList<>();
        int currentIndex = 1;
        currentIndex = getTreeNode(head, input, currentIndex, nodeList);
        while (currentIndex < input.length) {
            nodeList = getTreeNode(input, currentIndex, nodeList);
            currentIndex += nodeList.size();
        }
        return head;
    }

    private static List<TreeNode> getTreeNode(Integer[] input, int currentIndex, List<TreeNode> originalList) {
        List<TreeNode> newList = new ArrayList<>();
        for (TreeNode node : originalList) {
            currentIndex = getTreeNode(node, input, currentIndex, newList);
        }
        return newList;
    }

    private static int getTreeNode(TreeNode current, Integer[] input, int currentIndex, List<TreeNode> target) {
        if (current == null || currentIndex > input.length) {
            return currentIndex;
        }
        current.left = input[currentIndex] == null ? null : new TreeNode(input[currentIndex]);
        current.right = input[currentIndex + 1] == null ? null : new TreeNode(input[currentIndex + 1]);
        currentIndex += 2;
        target.add(current.left);
        target.add(current.right);
        return currentIndex;
    }

    @Override
    public String toString() {
        return "{" + " val=" + val +
                ",l:" + left +
                ", r:" + right +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right, val);
    }
}
