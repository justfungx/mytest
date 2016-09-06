package mytest;

public class java21 {

	public static void main(String[] args) {
		int[][] a;
		int[] b[];
		int c[][];
		a = new int[3][4];
		b = new int[3][];
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4];
		b[0][1] = 1;
		b[1][2] = 2;
		b[2][3] = 3;
		for (int i = 1; i <= b.length; i++){
			for (int j = 1; j < b[i].length; j++) {
				System.out.println(b[2]);
			}
		}
		
	}
}
