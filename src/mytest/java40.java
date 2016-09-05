package mytest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class java40 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/s.dat"));
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			oin.close();
			System.out.println(s1.getScore());
			System.out.println(s1.getAvg());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}