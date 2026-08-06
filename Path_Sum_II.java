import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root,targetSum, 0, res, new ArrayList<>());
        return res;
    }

    private void dfs (TreeNode root, int targetSum, int currSum, List<List<Integer>> res, List<Integer> currPath){
        if(root == null){
            return;
        }

        currSum += root.val;
        currPath.add(root.val);

        if(root.left == null && root.right == null && currSum == targetSum){
            res.add(new ArrayList<>(currPath));
        }

        dfs(root.left, targetSum, currSum, res, currPath);
        dfs(root.right, targetSum, currSum, res, currPath);

        currPath.remove(currPath.size()-1);
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);

        Path_Sum_II pathSumII = new Path_Sum_II();
        List<List<Integer>> result = pathSumII.pathSum(root, 22);

        System.out.println(result); // Output: [[5, 4, 11, 2], [5, 8, 4, 5]]
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
