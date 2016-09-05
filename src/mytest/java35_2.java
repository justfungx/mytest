package mytest;

import java.io.File;
import java.io.FileInputStream;

public class java35_2 {

	public static void main(String[] args) {
		File f1 = new File("dir1/1.txt");
		long len = f1.length();
		try {
			FileInputStream fis = new FileInputStream(f1);
			int c; byte[] buf = new byte[(int)len];
			c = fis.read(buf);
			System.out.println(new String(buf));
			
			
			fis.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}