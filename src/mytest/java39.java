package mytest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class java39 {

	public static void main(String[] args) {
		Student s1 = new Student(76, 54, 43);
		System.out.println(s1.getScore());
		System.out.println(s1.getAvg());
		try {
			ObjectOutputStream oout =
				new ObjectOutputStream(
					new FileOutputStream("dir1/s.dat"));
			oout.writeObject(s1);
			oout.flush();
			oout.close();
		} catch (IOException e) {
			System.out.println("Exception: " + e.toString());
		}
	}
}
//宣告學生資料成序列化
class Student implements Serializable{
	int ch, eng, math;
	Student(int ch, int eng, int math){
		this.ch = ch; this.eng = eng; this.math=math;
	}
	public Student(String string, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	int getScore(){return ch+eng+math;}
	double getAvg(){return getScore()/3.0;}
}
