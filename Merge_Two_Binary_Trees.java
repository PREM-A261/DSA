import javax.swing.tree.TreeNode;

public class Merge_Two_Binary_Trees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)
            return root2;
    
        if(root2==null)
            return root1;
            
            root1.val = root1.val + root2.val;
            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);
            
        return root1;
    }
    public static void main(String[] args) {
        // Example usage
        Merge_Two_Binary_Trees merger = new Merge_Two_Binary_Trees();
        // Create two binary trees and call mergeTrees method
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);   
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
        
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        TreeNode mergedRoot = merger.mergeTrees(root1, root2);
        printTree(mergedRoot);
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
