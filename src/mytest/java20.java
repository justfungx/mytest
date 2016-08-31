package mytest;

public class java20 {

	public static void main(String[] args) {
	int [] p =new int[6];
		for( int i= 0; i <= 100 ; i++){
		int point =(int)(Math.random()*6);
		p[point]++;
		//p[point >= 6?point-3:]
		}
		for(int i =0 ; i<p.length; i++){
		System.out.println((i+1)+"點出現"+p[i]+"次");
	}
		}
}
