public class BinaryTree
{
    static void preorder(node r)
    {
        if(r == null) { return; }
        System.out.print(r.data + " ");
        preorder(r.left);
        preorder(r.right);
    }
    static void inorder(node r)
    {
        if(r == null) { return; }
        inorder(r.left);
        System.out.print(r.data + " ");
        inorder(r.right);
    }
    static void postorder(node r)
    {
        if(r == null) { return; }
        postorder(r.left);
        postorder(r.right);
        System.out.print(r.data + " ");
    }
//    private node addRecursive(node current, int value) {
//        if (current == null) { return new node(value); }
//        if (value < current.data) { current.left = addRecursive(current.left, value); }
//        else if (value > current.data) { current.right = addRecursive(current.right, value); }
//        else { return current; }
//        return current;
//    }

}
