import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int n = queue.size();
            List<Integer> curr= new ArrayList<>();

            for(int i=0; i<n; i++){
                TreeNode node = queue.poll();
                curr.add(node.val);

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(curr);
        }
        return res;
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Binary_Tree_Level_Order_Traversal traversal = new Binary_Tree_Level_Order_Traversal();
        List<List<Integer>> result = traversal.levelOrder(root);

        System.out.println(result); // Output: [[3], [9, 20], [15, 7]]
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
