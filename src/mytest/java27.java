package mytest;

public class java27 {

	public static void main(String[] args) {
		java271 obj1 = new java271(2);
//		obj1.m1();
		java272 obj2 = new java272();
//		obj2.m2();
//		obj2.m1();
	}

}

class java271 {
	int a;
	java271(int b){
		//super()
		System.out.println("java271()");
	}

	void m1() {
		System.out.println("java271:m1()");
	}
}

class java272 extends java271 {
	java272(){
		super(2);
	}
	void m1() {
		super.m1();
		System.out.println("java272:m1():" + a);

	}

	void m2(){System.out.println("java272:m2()");}
}
