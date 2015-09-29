package algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class StackandLinke {

    public static void main(String[] args) {
        useLinkedList();
        StackandLinke a=new StackandLinke();
        StackandLinke b=a;
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }

    public static void useLinkedList() {
        LinkedList<Integer> list=new LinkedList<Integer>();
        Stack<Integer> a;
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(Arrays.toString(list.toArray()));
        
        list.push(4);
        list.push(5);
        System.out.println(Arrays.toString(list.toArray()));
        list.poll();
        list.pop();
        System.out.println(Arrays.toString(list.toArray()));
        list.removeLast();
        System.out.println(Arrays.toString(list.toArray()));
    }
}
