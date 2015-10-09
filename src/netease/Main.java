package netease;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        //getMush();
        getHits();
    }

    public static void getMush() {
        Scanner sc = new Scanner(System.in);
        String numbs = sc.nextLine();
        String[] chars = numbs.trim().split(" ");
        int n = Integer.parseInt(chars[0]);
        int m = Integer.parseInt(chars[1]);
        int k = Integer.parseInt(chars[2]);
        if ((n <= 3 && m <= 3) || k <= 0) {
            System.out.println(k);
            return;
        }
        int num = k;
        int[][] mArray = new int[n][m];
        while (num >= 1) {
            num--;
            String nums = sc.nextLine();
            String[] ars = nums.trim().split(" ");
            mArray[Integer.parseInt(ars[0])][Integer.parseInt(ars[1])] = 1;
        }
    }

    public static void getHits() {
        Scanner sc = new Scanner(System.in);
        String numbs = sc.nextLine();
        String[] chars = numbs.trim().split(" ");
        int R, x1, y1, x2, y2, x3, y3, x0, y0,hits;
        double dis1,dis2,dis3,RR;
        hits=0;
        R = Integer.parseInt(chars[0]);
        x1 = Integer.parseInt(chars[1]);
        y1 = Integer.parseInt(chars[2]);
        x2 = Integer.parseInt(chars[3]);
        y2 = Integer.parseInt(chars[4]);
        x3 = Integer.parseInt(chars[5]);
        y3 = Integer.parseInt(chars[6]);
        x0 = Integer.parseInt(chars[7]);
        y0 = Integer.parseInt(chars[8]);
        if(R<=0){
            System.out.println("0X");
        }
        RR=Math.pow(R,2);
        System.out.println(x1-x0);
        System.out.println(y1-y0);
        dis1=Math.pow((x1-x0),2)+Math.pow((y1-y0),2);
        dis2=Math.pow((x2-x0),2)+Math.pow((y2-y0),2);
        dis3=Math.pow((x3-x0),2)+Math.pow((y3-y0),2);
        System.out.println(dis1+" "+dis2+" "+dis3+" "+RR);
        if(RR>=dis1) hits++;
        if(RR>=dis2) hits++;
        if(RR>=dis3) hits++;
        System.out.println(hits+"X");
    }
}