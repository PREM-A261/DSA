package DAY9;

public class day9 {

    // int i= -1;
    // public class Node{
    //     int data;
    //     Node left;
    //     Node right;

    //     Node (int data){
    //         this.data = data;
    //         this.left = null;
    //         this.right = null;
    //     }
    // }

    // public Node insert( int[] Nodes){
    //     i++;
    //     if(Nodes[i] == -1){
    //         return null;
    //     }
    //     Node newNodes = new Node(Nodes[i]);
    //     newNodes.left = insert(Nodes);
    //     newNodes.right = insert(Nodes);
    //     return newNodes;
    // }
    // public static void main(String[] args) {
    //     day9 bt = new day9();
    //     int[] nodes = {3,1,-1,-1,7,-1,-1};

    //     Node root = bt.insert(nodes);
    //     System.out.println(root.data);
    //     System.out.println(root.left.data);
    //     System.out.println(root.right.data);
    // }




        // insertion in binary tree
    //     int i= -1;
    // public class Node{
    //     int data;
    //     Node left;
    //     Node right;

    //     Node (int data){
    //         this.data = data;
    //         this.left = null;
    //         this.right = null;
    //     }
    // }
    // public Node insert(int[] Nodes){
    //     i = -1;  // Reset counter for fresh insertion
    //     return insertHelper(Nodes);
    // }
    
    // private Node insertHelper(int[] Nodes){
    //     i++;
    //     if(i >= Nodes.length || Nodes[i] == -1){
    //         return null;
    //     }
    //     Node newNodes = new Node(Nodes[i]);
    //     newNodes.left = insertHelper(Nodes);
    //     newNodes.right = insertHelper(Nodes);
    //     return newNodes;
    // }
    // public static void main(String[] args) {
    //     day9 bt = new day9();
    //     int[] nodes = {3,1,-1,-1,7,-1,-1};

    //     Node root = bt.insert(nodes);
    //     System.out.println(root.data);
    //     System.out.println(root.left.data);
    //     System.out.println(root.right.data);
    // }



         int i= -1;
    public class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node insert(Node root, int[] Nodes){
        i++;
        if(Nodes[i] == -1){
            return null;
        }
        Node newNodes = new Node(Nodes[i]);
        newNodes.left = insert(newNodes.left, Nodes);
        newNodes.right = insert(newNodes.right, Nodes);
        return newNodes;
    }
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);

    }

    public int treeHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int left = treeHeight(root.left);
        int right = treeHeight(root.right);

        return Math.max(left, right) + 1;

    }

    // sum of nodes in binary tree
    public int sumOfNodes(Node root) {
        if (root == null)
            return 0;

        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);

        return left + right + root.data;
    }
    
    public static void main(String[] args) {
        day9 bt = new day9();
        int[] nodes = {3,1,-1,-1,7,-1,-1};

        Node root = bt.insert(null, nodes);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(bt.treeHeight(root));
        System.out.println(bt.sumOfNodes(root));
    }

    





    


//     int i = -1;

//     class Node {

//         Integer data;
//         Node left;
//         Node right;

//         Node(Integer data) {

//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public Node buildTree(int[] nodes) {
//         i++;
//         if (nodes[i] == -1) {
//             // return new Node(null);
//             return null;
//         }

//         Node newNode = new Node(nodes[i]);
//         newNode.left = buildTree(nodes);
//         newNode.right = buildTree(nodes);

//         return newNode;
//     }

//     public void preOrder(Node root) {
//         if (root == null) {
//             return;
//         }

//         System.out.println(root.data);
//         preOrder(root.left);
//         preOrder(root.right);

//     }

//     public void postOrder(Node root) {
//         if (root == null) {
//             return;
//         }

//         postOrder(root.left);
//         postOrder(root.right);
//         System.out.println(root.data);

//     }

//     public void inOrder(Node root) {
//         if (root == null) {
//             return;
//         }

//         inOrder(root.left);
//         System.out.println(root.data);
//         inOrder(root.right);

//     }

//     public int treeHeight(Node root) {

//         if (root == null) {
//             return 0;
//         }

//         int left = treeHeight(root.left);
//         int right = treeHeight(root.right);

//         return Math.max(left, right) + 1;

//     }

//     public int sumOfNodes(Node root) {
//         if (root == null)
//             return 0;

//         int left = sumOfNodes(root.left);
//         int right = sumOfNodes(root.right);

//         return left + right + root.data;
//     }

//     public static void main(String[] args) {

//         Day8BT bt = new Day8BT();
//         int[] nodes = {2, 1, -1, -1, 3, -1, 8, -1, -1};

//         Node root = bt.buildTree(nodes);
//         // System.out.println(root.data);
//         // System.out.println(root.left.data);
//         // System.out.println(root.right.data);
//         // System.out.println(root.right.left.data);

//         // bt.preOrder(root);
//         // bt.postOrder(root);
//         // bt.inOrder(root);

//         // System.out.println(bt.treeHeight(root));
//         System.out.println(bt.sumOfNodes(root));

//     }

}
