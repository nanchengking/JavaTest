package markInput;

import java.io.File;

/**
 * 这个是用来测试随机访问文件，并且记录当前行位置的方法
 * @author Administrator
 *
 */
public class InputTest {
    private  File file;
    public final static int count = 100;
    private  Write wiriter;
    private  Read reader;

    public InputTest() {
        this.file = new File("D:/Test.txt");
        this.wiriter = new Write(file, count);
        this.reader = new Read(file, count);
    }

    public static void main(String args[]) {
      InputTest test=new InputTest();
       // test.wiriter.run();
        test.reader.run();
    }
}
