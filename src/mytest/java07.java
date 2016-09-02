package mytest;

public class java07 {

	public static void main(String[] args) {
		byte a = 10 , b = 8;
		//byte c = a + b;   byte int short 內互為加減乘除取餘數  都是為 int 存放
		// (byte short int) long 
		int c = a + b ;
		//int d = a + b  => 18
		double e = 10 ,f = 3;
		double d = a + b ;  //強型別 & 弱型別差異
		double g = e / f ;
		System.out.println(g);
	}

}
