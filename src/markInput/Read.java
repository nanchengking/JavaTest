package markInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 真的很好用！！！
 * @author Administrator
 *
 */
public class Read implements Runnable {
    RandomAccessFile reader;
    File file;
    int count;
    String str;
    long point;
    @Override
    public void run() {
        for (int i = 0; i < this.count; i++) {
            StringBuffer buffer=new StringBuffer();
            try {
                point=reader.getFilePointer();
                if(point>=0){
                    reader.seek(point);
                    while((str= reader.readLine())!=null){
                        System.out.println("读取"+reader.getFilePointer());
                        buffer.append(str+"\n");
                    }
                    String test=buffer.toString();
                    String pattern = "^\n?(.*?)\n?$";

                    // 创建 Pattern 对象
                    Pattern r = Pattern.compile(pattern);

                    // 现在创建 matcher 对象
                    Matcher m = r.matcher(test);
                    if (m.find( )) {
                       test=m.group(0);
                       System.out.println("Found value: " + m.group(0) );
                    } else {
                       System.out.println("NO MATCH");
                    }
                    System.out.println(" real data is===: "+test);
                    Thread.sleep(1000);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Read(File file, int count) {
        this.count = count;
        this.file = file;
        try {
            this.reader = new RandomAccessFile(this.file,"rw");
        } catch (FileNotFoundException e) {
            System.out.println("创建文件！ " + e.getMessage());
        }
    }

}
