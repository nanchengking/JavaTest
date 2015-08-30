package markInput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write implements Runnable {
    File file;
    BufferedWriter wirter;
    int count;

    @Override
    public void run() {
        for (int i = 0; i < this.count; i++) {
            try {
                wirter.write("this is a new line with number:" + i + "\n");
                wirter.flush();
                System.out.println("写出：" + i);
                Thread.sleep(10);
            } catch (IOException e) {
                System.out.println("写的时候出错" + e.getMessage());
            } catch (Exception e) {
                System.out.println("睡眠时候出错！");
            }

        }

    }

    public Write(File file, int num) {
        this.file = file;
        this.count = num;
        try {
            this.wirter = new BufferedWriter(new FileWriter(this.file));
        } catch (IOException e) {
            System.out.println("创建文件：" + e.getMessage());
        }
    }
}
