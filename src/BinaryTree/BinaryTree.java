package BinaryTree;

public class BinaryTree<T> {
    public BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void preOrder() {
        System.out.println("先跟顺序遍历");
        preOrder(root);
    }

    public void preOrder(BinaryNode<T> p) {
        if (p != null) {
            System.out.println(p.data.toString() + " ");
            preOrder(p.left);
            preOrder(p.right);
        }
    }

    public void inOrder() {
        System.out.println("中跟顺序遍历");
        inOrder(root);
    }

    public void inOrder(BinaryNode<T> p) {
        if (p != null) {
            inOrder(p.left);
            System.out.println(p.data.toString() + " ");
            inOrder(p.right);
        }
    }

    public void postOrder() {
        System.out.println("后跟顺序遍历");
        postOrder(root);
    }

    public void postOrder(BinaryNode<T> p) {
        if (p != null) {
            postOrder(p.left);
            postOrder(p.right);
            System.out.println(p.data.toString() + " ");
        }
    }

}
