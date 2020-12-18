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
    }
}
