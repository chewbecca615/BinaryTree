public class treeDriver {
    public static void main(String[] args)
    {
        node root = new node(1); // creating tree


        root.left = new node(2); // adding to the tree
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);

        System.out.println("preorder: ");
        BinaryTree.preorder(root);
        System.out.println();

        System.out.println("in order: ");
        BinaryTree.inorder(root);
        System.out.println();

        System.out.println("post order: ");
        BinaryTree.postorder(root);
        System.out.println();

        System.out.println("adding a number: 8");
        root.right.left.left = new node(8);
        BinaryTree.preorder(root);
        System.out.println();

        System.out.println("removing a number:");
        replaceNode(root, 1);
        BinaryTree.preorder(root);
        System.out.println();

        System.out.println("updating a number:");
        updatetree(root);
        BinaryTree.preorder(root);
        System.out.println();
    }
    static void replaceNode(node node, int level)
    {
        if (node == null) { return; }
        node.data = level;
        replaceNode(node.left, level + 1);
        replaceNode(node.right, level + 1);
    }
    static int updatetree(node root)
    {
        if (root == null) { return 0; }
        if (root.left == null && root.right == null) { return root.data; }
        int leftsum = updatetree(root.left);
        int rightsum = updatetree(root.right);
        root.data += leftsum;
        return root.data + rightsum;
    }
}
