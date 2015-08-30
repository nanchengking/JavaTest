package markInput;

import java.io.File;

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
