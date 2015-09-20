package baidu;

import java.util.Scanner;

public class Baidu {

    public static void main(String[] args) {
     /*    System.out.println(getSum("81 4 \n 2 2"));
         System.out.println(getFlower("100 120 \n 300 380"));
        int[] arr = { 2, 1, 0, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String numbs = sc.nextLine();
        String[] chars = numbs.trim().split(" ");
        int[] array = new int[chars.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(chars[i]);
        }
        System.out.println(reverse(arr, arr.length));*/
        
        System.out.println(reverseString("abcd efgh ij k "));
    }

    public static String getSum(String numList) {
        String[] groups = numList.split("\n");
        StringBuffer results = new StringBuffer();
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        if (groups.length == 0)
            return null;
        for (int i = 0; i < groups.length; i++) {
            String[] nums = groups[i].trim().split(" ");
            int n = Integer.parseInt(nums[0].trim());
            int m = Integer.parseInt(nums[1].trim());
            double sum = 0;
            double tem = n;
            for (int j = 0; j < m; j++) {
                sum += tem;
                tem = Math.sqrt(tem);
            }
            results.append(df.format(sum) + "\n");
        }
        return results.toString();
    }

    public static String getFlower(String numList) {
        String[] groups = numList.split("\n");
        StringBuffer results = new StringBuffer();
        if (groups.length == 0)
            return null;
        for (int i = 0; i < groups.length; i++) {
            boolean isGood = false;
            String[] nums = groups[i].trim().split(" ");
            int n = Integer.parseInt(nums[0].trim());
            int m = Integer.parseInt(nums[1].trim());
            int t = 0;
            if (n < m) {
                t = m;
                m = n;
                n = t;
            }
            for (int j = m; j <= n; j++) {
                char[] chars = (j + "").toCharArray();
                int sum = 0;
                for (int k = 0; k < chars.length; k++) {
                    char[] mChars = { chars[k] };
                    int a = Integer.parseInt(new String(mChars).trim());
                    sum += (a * a * a);
                }
                if (sum == j) {
                    isGood = true;
                    results.append(j + " ");
                }
            }
            if (!isGood)
                results.append("no");
            results.append("\n");
        }
        return results.toString();
    }

    public static String reverse(int[] arr, int len) {
        StringBuffer bf = new StringBuffer();
        if (len <= 2)
            return "yes";
        boolean isIncrease = false;
        boolean oldIsIncrean = false;
        if (arr[0] > arr[1]) {
            isIncrease = false;
            oldIsIncrean = isIncrease;
        } else {
            isIncrease = true;
            oldIsIncrean = isIncrease;
        }

        int num = 0;
        for (int i = 0; i < len - 1; i++) {
            if (isIncrease) {
                if (arr[i] > arr[i + 1]) {
                    isIncrease = false;
                    num++;
                    bf.append(i - 1);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    isIncrease = true;
                    num++;
                    bf.append(i);
                }
            }
        }
        char[] chars = bf.toString().toCharArray();
        int[] results = new int[chars.length];
        for (int j = 0; j < chars.length; j++) {
            char[] a = { chars[j] };
            results[j] = Integer.parseInt(new String(a));
        }
        if (num == 1) {
            if (oldIsIncrean) {
                if (arr[results[0]] < arr[len - 1]) {
                    return "yes";
                }
            } else {
                if (arr[results[0] + 1] > arr[0]) {
                    return "yes";
                }
            }
        } else if (num == 2) {
            if (oldIsIncrean) {
                if (arr[results[0]] < arr[results[1]] && arr[results[0] + 1] < arr[results[1] + 1]) {
                    return "yes";
                }
            }
        }
        return "no";
    }

    /**
     * 反转字符串,不用StringBuffer来实现
     * 
     * @param str
     */
    public static String reverseString(String str) {
        if (str.trim().equals(" ")) {
            return str;
        }
        char[] chars = str.toCharArray();
        char tem;
        int head = 0;
        int tail = str.length() - 1;
        while (tail > head) {
            tem = chars[head];
            chars[head] = chars[tail];
            chars[tail] = tem;
            tail--;
            head++;
        }
        return new String(chars);
    }
}
