import javax.swing.tree.TreeNode;
public class Sum_of_Left_Leaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null){
            return 0;
        }
        
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
         sum += sumOfLeftLeaves(root.left);
         sum += sumOfLeftLeaves(root.right);
        return sum;
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Sum_of_Left_Leaves solution = new Sum_of_Left_Leaves();
        int result = solution.sumOfLeftLeaves(root);
        System.out.println("Sum of left leaves: " + result); // Output: 24
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
