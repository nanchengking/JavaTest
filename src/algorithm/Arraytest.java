package algorithm;

import java.util.Arrays;

public class Arraytest {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 6, 4, 5, 7 };
        // reOrderArray(arr);
        // shellShort(arr);
        //insertSort(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reOrderArray(int[] array) {
        if (array == null || array.length <= 1)
            return;
        int edge = array.length - 1;
        int len = array.length - 1;
        int i = 0;

        while (edge > i) {
            int k = i;
            while (array[k] % 2 == 0 && k < len) {
                k++;
            }
            if (k == len)
                return;

            if (array[i] % 2 == 0) {
                int tem = array[i];
                for (int j = i; j <= len; j++) {
                    if (j == len) {
                        array[len] = tem;
                        break;
                    }
                    array[j] = array[j + 1];
                }
                edge--;
            } else {
                i++;
            }
        }
    }

    /**
     * 希尔排序
     * 
     * @param arr
     */
    public static void shellShort(int[] arr) {
        // delta是增量,初始值未长度的一般是默认规则,每循环一次减少一半
        for (int delta = arr.length / 2; delta > 0; delta /= 2) {
            for (int i = delta; i < arr.length; i++) {
                int tem = arr[i];
                int j;
                for (j = i - delta; j >= 0 && tem<arr[j]; j -= delta) {
                    arr[j + delta] = arr[j];
                }
                arr[j + delta] = tem;
            }
        }
    }

    /**
     * 插入排序法
     * 
     * @param arr
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 假设前i-1个都是排序过得,
            // 那么arr[0]必然是有序的,接下在,
            // 把第i个插入前面0~i-1个元素就好了
            int tem = arr[i];//记录当前需要插入的元素
            int j = i - 1;
            for (; j >= 0 && tem < arr[j]; j--) {//这儿的目的是遍历i个之前的元素
                arr[j + 1] = arr[j];//
            }
            arr[j + 1] = tem;
        }
    }
    
    public static void  bubbleSort(int[] arr){
        boolean change=true;
        for(int i=0;i<arr.length&&change;i++){
            change=false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    change=true;
                }
            }
        }
    }
}
