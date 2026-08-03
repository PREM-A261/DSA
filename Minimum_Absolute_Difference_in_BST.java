import javax.swing.tree.TreeNode;

public class Minimum_Absolute_Difference_in_BST {
    int ans = Integer.MAX_VALUE;
    TreeNode prev = null;
    private void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        if(prev != null){
            ans = Math.min(ans,Math.abs( prev.val - root.val));
        }
        prev = root;
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return 0;
        }
        inorder(root);
        return ans;
    }
    public static void main(String[] args) {
        Minimum_Absolute_Difference_in_BST solution = new Minimum_Absolute_Difference_in_BST();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int result = solution.getMinimumDifference(root);
        System.out.println("Minimum Absolute Difference: " + result); // Output: 1
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
