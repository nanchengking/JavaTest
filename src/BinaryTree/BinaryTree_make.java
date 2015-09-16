package BinaryTree;

public class BinaryTree_make {

    public static void main(String[] args) {
        BinaryTree<String> tree=make();
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();

    }

    public static BinaryTree<String> make() {
        BinaryTree<String> tree = new BinaryTree<String>();
        BinaryNode<String> child_f, child_b, child_d, child_c, child_e, child_g, child_a;
        child_d = new BinaryNode<String>("D", new BinaryNode<String>("H"), new BinaryNode<String>("I"));
        child_e = new BinaryNode<String>("E", new BinaryNode<String>("J"), new BinaryNode<String>("K"));
        child_f = new BinaryNode<String>("F", new BinaryNode<String>("L"), new BinaryNode<String>("M"));
        child_g = new BinaryNode<String>("G", new BinaryNode<String>("O"), new BinaryNode<String>("P"));
        child_b = new BinaryNode<String>("B", child_d, child_e);
        child_c = new BinaryNode<String>("C", child_f, child_g);
        tree.root = new BinaryNode<String>("A", child_b, child_c);
        return tree;
    }

    public static BinaryTree<String> recoverByPreAndIn(String[] pre,String[] in){
        BinaryTree<String> tree = new BinaryTree<String>();
        BinaryNode<String> root=new BinaryNode<String>(pre[0]);
        return null;
        
    }
}
