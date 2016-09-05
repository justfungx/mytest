package mytest;

public class java04 {

	public static void main(String[] args) {
		
		byte a = 127 ;  // 127 ,128 , 129 => int
		a++;  //-128
		/*
		 * 因為超出BYTE  128範圍所以會變成-128
		 * 
		 * 這邊的+不是數學加法
		 */ 
		a += 4 ;
		long b =12 ;
		// a = b  A的值無法帶入於B  因為B宣告為LONG
		System.out.println(a);
		//int c = 12 ;  直譯 12
		int c = 012 ;  //  零開頭 為 8進制  所以解讀為  8 *1 +2  =10
		System.out.println(c);

		int d = 0X12; // 解讀為 0X = 16 *1+2
		System.out.println(d);
		
	}

}
