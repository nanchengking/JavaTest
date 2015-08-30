package markInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

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
                        buffer.append(str);
                    }
                    System.out.println("===: "+buffer.toString());
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
