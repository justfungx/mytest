package mytest;

public class java30 {

	public static void main(String[] args) {
	 java301 obj1 = new java301();
	 // 抽象在內 所以無法提出302 java302 obj2 = new java302();
	 java303 obj3 = new java303();

	}

}
class java301{
	void m1(){}
	void m2(){}
}

abstract class java302{
	java302(){
		System.out.println("java302()");
	}
	void m1(){}
	abstract  void m2();
}

//對照組 抽象 與 非抽象
class java303 extends java302{
	void m2(){System.out.println("java302");}
}
abstract class java304 extends java302{
	void m2(){System.out.println("java302");}
}
