import javax.swing.tree.TreeNode;

public class Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal {
    int preIdx , postIdx;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[preIdx]);
        preIdx++;

        if(root.val != postorder[postIdx]){
            root.left= constructFromPrePost(preorder, postorder);
        }

        if(root.val != postorder[postIdx]){
            root.right= constructFromPrePost(preorder, postorder);
        }

        postIdx++;

        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder, int preIdx, int postIdx) {
        this.preIdx = preIdx;
        this.postIdx = postIdx;
        return constructFromPrePost(preorder, postorder);
    }
    public static void main(String[] args) {
        Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal solution = new Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal();
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] postorder = {4, 5, 2, 6, 7, 3, 1};
        TreeNode root = solution.constructFromPrePost(preorder, postorder, 0, 0);
        // You can add code here to print the tree or verify the structure
        solution.printTree(root);
    }
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }
}
