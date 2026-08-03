public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val<root.val && q.val>root.val){
            return root;
        }
        
        if(p.val == root.val || q.val == root.val){
            return root;
        }

        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>root.val && q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
    public static void main(String[] args) {
        Lowest_Common_Ancestor_of_a_Binary_Search_Tree lca = new Lowest_Common_Ancestor_of_a_Binary_Search_Tree();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = root.left; // Node with value 2
        TreeNode q = root.right; // Node with value 8

        TreeNode ancestor = lca.lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor: " + ancestor.val); // Should print 6
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
