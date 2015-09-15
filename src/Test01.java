public class Test01 {
    public static int a=3;
    public static void main(String args[]) {
        int[][] array = { { 1, 3, 4 }, { 4, 5, 6 }, { 6, 7, 8 }, { 11, 12, 13 }, { 12, 14, 15 } };
        System.out.println(isFind(array, 15));
        testIn();
    }

    public static void testIn(){
        if(a!=0){
            a--;
            testIn();
            System.out.println(a);
        }
    }
    
    public static boolean isFind(int[][] array, int target) {
        int x = 0;
        int y = array.length - 1;
        while (y >= 0 && x < array[y].length) {
            if (array[y][x] > target) {
                y--;
            } else if (array[y][x] < target) {
                x++;
            } else {
                return true;
            }
        }
        String test = "";
        test.toCharArray();
        return false;
    }

    public String replaceSpace(StringBuffer str) {
        StringBuffer bf = new StringBuffer();
        char[] chars = str.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                bf.append(chars[i]);
            } else {
                bf.append("%20");
            }
        }
        return bf.toString();
    }
}
