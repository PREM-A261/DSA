import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helperFunc(new StringBuilder(), root);
        return result;
    }

    private void helperFunc(StringBuilder path, TreeNode root){
        if(root == null){
            return;
        }
        int len = path.length();
        if(len != 0){
            path.append("->");
        }

        path.append(root.val);

        if(root.left == null && root.right == null){
            result.add(path.toString());
        }else{
            helperFunc(path,root.left);
            helperFunc(path, root.right);
        }

        path.setLength(len);
    } 
    public static void main(String[] args) {
        // Example usage
        Binary_Tree_Paths pathFinder = new Binary_Tree_Paths();
        // Create a binary tree and call binaryTreePaths method
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> paths = pathFinder.binaryTreePaths(root);
        System.out.println("All Root-to-Leaf Paths: " + paths);
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
