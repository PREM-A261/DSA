import javax.swing.tree.TreeNode;

public class Subtree_of_Another_Tree {
    public boolean isSame(TreeNode s, TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
        if(s.val != t.val){
            return false;
        }
        return isSame(s.left,t.left)&&isSame(s.right,t.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(isSame(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot);
    }
    public static void main(String[] args) {
        Subtree_of_Another_Tree solution = new Subtree_of_Another_Tree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        boolean result = solution.isSubtree(root, subRoot);
        System.out.println(result); // Output: true
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.val + " ");
        printTree(node.right);
    }
}
