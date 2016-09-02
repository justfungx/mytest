package mytest;

public class java08 {

	public static void main(String[] args) {
		double a = 10 , b = 0; // a =10 b = 0 ,a/b =>無限大，這裡的零是趨近於零的零 非真的零 
		// a = -10 , b =  0 ;   => 負無限大    a = 0, b =0  =>無意義
		System.out.println(a/b);
		 int c = 1 ,e =5;
		 //int f = c&e ;
		 //int f = c|e;
		 int f = c^e;
		 System.out.println(f);

	}

}
