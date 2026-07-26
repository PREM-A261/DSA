public class Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Invert_Binary_Tree solution = new Invert_Binary_Tree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode invertedRoot = solution.invertTree(root);
        solution.printTree(invertedRoot);
        System.out.println();
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