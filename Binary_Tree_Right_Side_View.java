import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            
            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();

                if(i == n-1){
                    res.add(node.val);
                }

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        } 
        return res;
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        Binary_Tree_Right_Side_View view = new Binary_Tree_Right_Side_View();
        List<Integer> result = view.rightSideView(root);

        System.out.println(result); // Output: [1, 3, 4]
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
