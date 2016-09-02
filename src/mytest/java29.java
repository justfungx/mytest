package mytest;

public class java29 {

	public static void main(String[] args) {
	 java292 obj1 = new java292();
	 java293 obj2 = new java293();
	 
	 java294 obj3 = new java294();
	 obj3.m3(obj1);

	}

}
//自訂義宣告介面
interface java291{
	void m1();
	void m2();
}
//對外宣告介面定義方法
class java292 implements java291{
	public void m1(){System.out.println("java291.m1()");};
	public void m2(){System.out.println("java291.m2()");};
}
class java293 implements java291{
	public void m1(){System.out.println("java292.m1()");};
	public void m2(){System.out.println("java292.m2()");};
}
class java294{
	void m3(java291 b){
	b.m1();
	}
}

