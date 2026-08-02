public class Maximum_Depth_of_Binary_Tree {
        public int maxDepth(TreeNode root) {
        if(root ==  null)
            return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(right,left)+1;
    }
    public static void main(String[] args) {
        // Example usage
        Maximum_Depth_of_Binary_Tree depthCalculator = new Maximum_Depth_of_Binary_Tree();
        // Create a binary tree and call maxDepth method
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int depth = depthCalculator.maxDepth(root);
        System.out.println("Maximum Depth of the Binary Tree: " + depth);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
