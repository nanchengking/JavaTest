package SingleList;

public class Node {
    public int val;
    public Node next;

    public Node() {
        this.val = -1;
        this.next = null;
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
