package nowcoder;

import java.util.Stack;

public class StackInAndOut {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    public static boolean isRightOrder(int[] in,int[] out){
        if(in.length==0&&out.length==0) return true;
        if(in==null||out==null) return false;
        
        Stack<Integer> re=new Stack<Integer> ();
        int j=0;
        for(int i=0;i<in.length;i++){
            re.add(in[i]);
            while(!re.isEmpty()&&re.peek()==out[j]){
                j++;
                re.pop();
            }
        }
        return re.isEmpty();
    }

}
