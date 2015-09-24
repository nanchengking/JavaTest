package algorithm;

public class RegularPattern implements Comparable<RegularPattern> {
    int a;

    @Override
    public int compareTo(RegularPattern o) {
        if (this.a > o.a)
            return 1;
        else if (this.a == o.a)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        RegularPattern a = new RegularPattern();
        RegularPattern b = new RegularPattern();
        a.a = 10;
        b.a = 9;
        System.out.println(a.compareTo(b));
    }

}
