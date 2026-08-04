import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {
    List<Integer> res = new ArrayList<>();
    public void inorder(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }

        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root, res);
        return res;
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Binary_Tree_Inorder_Traversal solution = new Binary_Tree_Inorder_Traversal();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result); // Output: [1, 3, 2]
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
