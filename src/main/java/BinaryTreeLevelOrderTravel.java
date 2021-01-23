import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTravel {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        travel(root, -1);
        Collections.reverse(result);
        return result;
    }

    public void travel(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        level += 1;
        if (result.size() == level) {
            List<Integer> currentResult = new ArrayList<>();
            result.add(currentResult);
        }
        List<Integer> currentResult = result.get(level);
        if (currentResult == null) {

        }
        currentResult.add(node.val);
        travel(node.left, level);
        travel(node.right, level);
    }
}
