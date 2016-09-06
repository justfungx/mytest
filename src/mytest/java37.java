package mytest;

import java.io.FileOutputStream;

public class java37 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dir1/1.txt" ,true);
			fout.write("123\n2134\12aadfadfre".getBytes());
			fout.flush();
			fout.close();
			System.out.println("write OK");
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
