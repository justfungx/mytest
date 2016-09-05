package mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class java34 {

	public static void main(String[] args) {
		File file1 = new File("c:/king/file1");
		if (file1.isFile()){ //檢查是否存在這個檔案
			System.out.println("OK");
		}else{
			try{
				if (file1.createNewFile()){
					System.out.println("Create OK");
				}else{
					System.out.println("Create Fail");
				}
			}catch(IOException ie){ //解決所有跳脫錯誤
				System.out.println();
			}
		}
		
		File file2 = new File("c:/test/dir1/dir2/dir3/dir4");//最終為建構DIR4的檔案
		if (!file2.isDirectory()){ //檢查是否存在於抽象
			file2.mkdirs();
}
		//抓出有幾個儲存槽
		File f1 = new File("c:/test");
		File f2 = new File("c:/test");
		System.out.println(f1 == f2);
		
		File[] roots = File.listRoots();
		for (File root : roots){
			System.out.println(root.getAbsolutePath()); 
			//印出ROOT絕對路徑
		}
		
		
		
		
		
	}
}