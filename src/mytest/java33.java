package mytest;

public class java33 {

	public static void main(String[] args) {
		java331 obj1 = new java331();
		obj1.m1();

	}

}

class java331 {
void m1(){
	int a= 10 ,b = 2;
	try{
		System.out.println(a/b);
	}catch(Exception e){
		System.out.println("OK!!!");
	}finally{
		System.out.println("Finally");
	}
	System.out.println("YES");
	}

}