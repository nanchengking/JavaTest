package CrazyJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;
public class Test {
    public Test(){
        System.out.println("这是构造器里面的初始化,时间是: "+new Date());
    }
    {
        System.out.println("这是一个普通初始化块,时间是: "+new Date());
    }
   static {
        System.out.println("这是一个静态初始化块,时间是: "+new Date());
    }
    public static void main(String args[]) {
        File file=new File("object.txt");
        try(
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
        ){
            Person per=new Person("Liushuqing",22);
            oos.writeObject(per);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        System.out.println("这个类写入完毕");
        
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
            Person p=(Person) ois.readObject();
            System.out.println(p.age+p.name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public static void test(int a, String... books) {
        for (String tem : books) {
            System.out.println(tem);
        }
        System.out.println(a);
    }
}
class Person implements java.io.Serializable{

    public String name;
    public transient int age;//有了这个关键字,序列化的时候,这个FIeld(成员变量)就不会被序列化了
    public Person(String name,int age){
        System.out.println("调用A的构造方法");
        this.name=name;
        this.age=age;
    } 
    {
        System.out.println("This is normal A");
    }
    static{
        System.out.println("This is A in static");
    }
    static int a=100;
}


