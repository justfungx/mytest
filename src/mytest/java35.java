package mytest;

import java.io.File;
import java.io.FileInputStream;

public class java35 {

	public static void main(String[] args) {
		File f1 = new File("dir1/1.txt");
		try {

			FileInputStream fis = new FileInputStream(f1);
			int c;
			while ((c = fis.read()) != -1) { // 取-1是因為要將把資料讀取到結束~才會用-1
				System.out.println((char) c); // CHAR 強制轉型別
			}
			fis.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
