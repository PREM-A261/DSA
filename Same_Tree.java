import javax.swing.tree.TreeNode;

public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }

        if(p.val == q.val){
            boolean a = isSameTree(p.left , q.left);
            boolean b = isSameTree(p.right , q.right);

            return a&b;
        }
        return false;
    }
    public static void main(String[] args) {
        Same_Tree sameTree = new Same_Tree();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        boolean result = sameTree.isSameTree(p, q);
        System.out.println("Are the two trees the same? " + result);
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
