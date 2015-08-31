package chapter01;

import java.io.File;
import java.util.Scanner;

//"3C3N导航-浓缩精华"
//E:/Codes/JavaCodes
//E:/Codes/JavaCodes/Java版）（第3版）[叶核亚] 全套资料
public class FIleDelete {
	
	private static String pathName;
	private static String reg;
	private static File file;
	
	private static int count=0;

	public static void main(String[] args) throws Exception {
		System.out.println("请输入删除文件父路径: ");
		Scanner kb1=new Scanner(System.in);
		pathName=kb1.nextLine().trim();
		file=new File(pathName);
		System.out.println("请输入删除文件前缀: ");
		Scanner kb2=new Scanner(System.in);
		reg=kb2.nextLine().trim();
		kb1.close();
		kb2.close();	
		delete(file);		
		System.err.println("===共删除文件"+count+"个===");
	}
	
	public static void delete(File file) throws Exception{
		
		if(file.isDirectory()){
			File[]  fileArr=file.listFiles();
			for(int i=0;i<fileArr.length;i++){
				delete(fileArr[i]);
			}
		}else{
			if(file.getName().startsWith(reg)){
				file.delete();
				System.out.println("===删除文件： "+file.getName()+"===");
				count++;
			}
		}
	}
}
