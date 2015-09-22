package nowcoder;

import java.util.Stack;

/**
 * 牛博网的算法题目
 * 
 * @author nancheng
 *
 */
public class NewCoder {
    public static void main(String args[]) {
       // System.out.println(frogJump(2));
        getBinary(0);
      //testStack();
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * -------------------------------------------------------------------------
     * ----- （1）一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。 求该青蛙跳上一个n 级的台阶总共有多少种跳法。
     * （2）一只青蛙一次可以跳上1级台阶，也可以跳上2 级……它也可以跳上n 级， 此时该青蛙跳上一个n级的台阶总共有多少种跳法？ 分析：1）当n =
     * 1， 只有1中跳法；当n = 2时，有两种跳法；当n = 3 时，有3种跳法； 当n = 4时，有5种跳法；当n =
     * 5时，有8种跳法；....... 规律类似于Fibonacci数列
     * -------------------------------------------------------------------------
     * ------- 这就是一个数学推算=.=醉了,
     * 同样的,还有小矩形2*1去覆盖大矩形2*n的覆盖方式有几种,也是一个斐波那契数列 
     * 
     * @param n
     * @return 一共有多少种跳法
     */
    public static int frogJump(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 3;
        return frogJump(n - 1) + frogJump(n - 2);
    }
    
    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。 
     * @param n
     * @return
     */
    public static int getBinary(int n){
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        System.out.println(count);
        return count;
    }
    
    public static void testStack(){
        Stack<Integer> n=new Stack<Integer>();
        for(int i=0;i<10;i++){
            n.push(i);
            System.out.print(i);
        }
        int s=n.size();
        System.out.println();
        for(int j=0;j<s;j++){
            System.out.print(n.pop()+",");
        }
    }
}
