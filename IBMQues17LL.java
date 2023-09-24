/*
BST and its traversal
 */
class Node{
    int val;
    Node left, right;
    public Node(int item)
    {
        val = item;
        left = right = null;
    }
}
public class IBMQues17LL {
    Node root;
    public void preOrder(Node root)
    {
        if(root == null)
            return;
        System.out.print(" " + root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(" " + root.val);
        inOrder(root.right);
    }

    public void postOrder(Node root)
    {
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " + root.val);
    }

    public static void main(String[] args) {
        IBMQues17LL tree = new IBMQues17LL();
        tree.root = new Node(4);
        tree.root.left = new Node(1);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(2);
        System.out.print("\nBinary Tree: ");
        System.out.println();
        System.out.println("preOrder");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("inOrder");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("postOrder");
        tree.postOrder(tree.root);
        System.out.println();

    }
}
