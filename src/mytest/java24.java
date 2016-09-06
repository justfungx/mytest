package mytest;

public class java24 {

	public static void main(String[] args) {
		String S1 = new String("A1");
		String S2 = new String("A1");
		String S3 = "A1";
		String S4 = "A1";
		System.out.println(S1 == S2); //兩個字串的種類是從不同的位子取出
		
		System.out.println(S3 == S4); //兩者從同一個池子裡取出的值，因為是從同範圍中取出所以TRUR
		
		

	}

}
