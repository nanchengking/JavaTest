package SingleList;

public class SingleList {
    public Node head;
    public SingleList(){
        this.head=new Node();
    }
    public SingleList(int[] elements) {
        this();
        // 这儿的rear其实就是一个游标
        Node rear = this.head;
        for (int i = 0; i < elements.length; i++) {
            rear.next = new Node(elements[i]);
            rear = rear.next;
        }
        System.out.println("单链表创建完毕");
    }
    public void insert(Node node) {
        Node tem = this.head;
        while (tem.next != null) {
            tem = tem.next;
        }
        tem.next = node;
    }
    
    @Override
    public String toString() {
       StringBuffer bf=new StringBuffer();
       Node tem=this.head.next;
       while(tem.next!=null){
           bf.append(tem.val+",");
           tem=tem.next;
       }
        return bf.toString();
    }
}
