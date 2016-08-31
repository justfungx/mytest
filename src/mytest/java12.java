package mytest;

public class java12 {

	public static void main(String[] args) {
		//String a= "A" ;
		int a =10 ;
		final int b = 8 ; //● 加入final 句訴B為常數值
		switch (a) { //在switch型別中只接受byte、short、int、char的字元反為
		case 1:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B");
			break; //● break 是可以省略的、但程式會繼續執行直到下一個出現的break
		case 100:
			// case b :  在CASE中 只能接受常數 不接受變數值
			//● case b+5 :
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}

	}

}
