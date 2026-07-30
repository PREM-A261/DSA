import javax.swing.tree.TreeNode;

public class Symmetric_Tree {
    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return (left.val == right.val) && (isMirror(left.left,right.right) && isMirror(left.right,right.left));
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirror(root.left,root.right);

    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Symmetric_Tree solution = new Symmetric_Tree();
        boolean result = solution.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + result); // Output: true
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
