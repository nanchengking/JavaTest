package SingleList;

public class SlngleList_Test {

    public static void main(String[] args) {
        int[] elements = { 1, 4, 4 };
        SingleList list = new SingleList(elements);
        System.out.println(list);
        deleteDepulacete(list.head, 4);
        System.out.println(list);
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
        // 如果开始的元素的val就是相同的,那么就直接把这个给删除掉
        while (head != null && head.val == val)
            head = head.next;
        if (head == null)
            return head;
        head.next = deleteDepulacete(head.next, val);
        return head;
    }
}
