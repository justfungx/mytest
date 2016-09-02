package mytest;

public class java31 {

	public static void main(String[] args) {
	int  a = 10 , b =3;
	int [] d = {1,2,3,4};
	try{
		
	int c = a / b ;
	System.out.println(c);
	System.out.println(d[4]);
	}catch (RuntimeException re){
		System.out.println("123");
	
//	}catch (ArithmeticException ae){
//		System.out.println("Hello");
//	}catch (ArrayIndexOutOfBoundsException ae){
//		System.out.println("Hey");
//	}
	
	}
	System.out.println("GAME OVER");

}
}
