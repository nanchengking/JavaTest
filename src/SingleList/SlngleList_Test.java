package SingleList;

public class SlngleList_Test {

    public static void main(String[] args) {
        int[] elements = { 1, 4 };
        SingleList list = new SingleList(elements);
        System.out.println(list);
       deleteDepulacete(list.head, 4);
       //changeHead(list.head);
       // removeDepulacateNodes(list.head);
        System.out.println(list);
    }

    private static Node changeHead(Node head) {
        head.val=10000000;        
        return head;
    }

    /**
     * 删除给定值的元素,返回头指针
     */
    public static Node deleteDepulacete(Node head, int val) {
        if (head == null)
            return null;
        // 如果有一个元素,如果这个元素和val相同那么就删除返回null否则就头指针
        if (head.next == null) {
            if (head.val == val) {
                return null;
            } else {
                return head;
            }
        }
        // 如果开始的元素的val就是相同的,那么就直接把这个给删除掉,这儿必须用while而不是if因为,如果用if就会没有删除
        while (head != null && head.val == val)
            head = head.next;
        if (head == null)
            return head;
        head.next = deleteDepulacete(head.next, val);
        return head;
    }

    public static void removeDepulacateNodes(Node head) {
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                int val = head.val;
                while (head != null && head.val == val) {
                    head = head.next;
                }
            }else{
                head=head.next;
            }
        }
        System.out.println("重复节点删除完毕");
    }

    /**
     * 首先考虑异常情况，head 为 NULL 时返回 NULL new一个dummy变量，dummy->next指向原链表头。
     * 使用新变量node并设置其为dummy头节点，遍历用。
     * 当前节点和下一节点val相同时先保存当前值，便于while循环终止条件判断和删除节点。注意这一段代码也比较精炼。
     * 最后返回dummy->next，即题目所要求的头节点
     * 
     * @param head
     * @return
     */
    public Node deleteDuplicates(Node head) {
        if (head == null)
            return null;
        Node dummy = new Node(0);
        dummy.next = head;
        Node node = dummy;
        while (node.next != null && node.next.next != null) {
            if (node.next.val == node.next.next.val) {
                int val_prev = node.next.val;
                while (node.next != null && node.next.val == val_prev) {
                    node.next = node.next.next;
                }
            } else {
                node = node.next;
            }
        }
        return dummy.next;
    }
}
