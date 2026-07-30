import javax.swing.tree.TreeNode;

public class Range_Sum_of_BST {
     public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        if(root.val<low){
            return rangeSumBST(root.right,low,high);
        }
        if(root.val>high){
            return rangeSumBST(root.left,low,high);
        }
        
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        Range_Sum_of_BST solution = new Range_Sum_of_BST();
        int low = 7;
        int high = 15;
        int result = solution.rangeSumBST(root, low, high);
        System.out.println("Range Sum of BST: " + result); // Output: 32
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
