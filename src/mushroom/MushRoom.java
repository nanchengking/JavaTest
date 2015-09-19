package mushroom;

import java.util.Scanner;

class MushRoom {

    public static void main(String[] args) {
        //getMInMax();
        getSteps();
    }

    public static int getMInMax() {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine().trim();
        if(a.equals("")) return 0;
        int len = Integer.parseInt(a);
        String numbs = sc.nextLine();
        String[] chars = numbs.trim().split(" ");
        int[] array = new int[chars.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(chars[i]);
        }

        if (len <= 2)
            return 0;
        int[] maxs=new int[len];
        int max=array[1]-array[0];
        int min=max;
        for(int i=0;i<len-1;i++){
            if(array[i+1]-array[i]>=max) max=array[i+1]-array[i];
        }
        for (int i = 1; i < len - 1; i++) {
            if (array[i + 1] - array[i - 1] >= max) {
                maxs[i]=array[i + 1] - array[i - 1];
            }else{
                maxs[i]=max;
            }
        }
        min=maxs[1];
        for(int j=1;j<maxs.length-1;j++){
            if(maxs[j]<=min) min=maxs[j];
        }
        System.out.println(min);
        return min;
    }
    
    public static void getSteps(){
        Scanner sc = new Scanner(System.in);
        String numbs=sc.nextLine().trim();
        if(numbs.equals("")) System.out.println("非法输入");
        String[] chars = numbs.trim().split(" ");
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(chars[i]);
        }
        int r=arr[0]*2;
        double distance=Math.sqrt((arr[3]-arr[1])*(arr[3]-arr[1])+(arr[4]-arr[2])*(arr[4]-arr[2]));
        double s=distance/r;
        if(distance%r>0) s++;
        int steps=(int)s;
        System.out.println(steps);
    }
    
    public static  void getChances(){
        Scanner sc = new Scanner(System.in);
        String numbs=sc.nextLine().trim();
        if(numbs.equals("")) System.out.println("非法输入");
        String[] chars = numbs.trim().split(" ");
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=Integer.parseInt(chars[i]);
        }
        
        int[] moa=new int[arr[0]];
        int[] mob=new int[arr[0]];
        int[] gua=new int[arr[1]];
        int[] gub=new int[arr[1]];
        for(int i=0;i<arr[0];i++){
            String ab=sc.nextLine().trim();
            String[] abs = numbs.trim().split(" ");
            moa[i]=Integer.parseInt(chars[0]);
            mob[i]=Integer.parseInt(chars[1]);
        }
        
        for(int i=0;i<arr[1];i++){
            String ab=sc.nextLine().trim();
            String[] abs = numbs.trim().split(" ");
            gua[i]=Integer.parseInt(chars[0])+arr[2];
            gub[i]=Integer.parseInt(chars[1])+arr[3];
        }
        
        int count=0;
        
        //for(int i=0)
        
        
    }
}
