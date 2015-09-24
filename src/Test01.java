public class Test01 {
    public static int a=3;
    public static void main(String args[]) {
        mTest test=new mTest();
        test.name="a";
        System.out.println(test.name);
        testPbjectSend(test);
        System.out.println(test.name);
       /* int[][] array = { { 1, 3, 4 }, { 4, 5, 6 }, { 6, 7, 8 }, { 11, 12, 13 }, { 12, 14, 15 } };
        System.out.println(isFind(array, 15));
        testIn();*/
    }
    
    public static void test(int a, String ... books) {
        for (String tem : books) {
            System.out.println(tem);
        }
        System.out.println(a);
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

    /**
     * 替换空格
     * @param str
     * @return
     */
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
    
    /**
     * 卧槽,发现了惊天大秘密,原来java里面存在引用传递,也就是说,一个对象传递给
     * 方法,方法的操作会直接影响这个对象的堆
     * @param m
     */
    public static void testPbjectSend(mTest m){
        m.name="bbb";
    }
    private static class mTest{
        String name;
    }
}
