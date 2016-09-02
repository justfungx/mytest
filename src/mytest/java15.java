package mytest;

import javax.naming.spi.DirStateFactory.Result;

public class java15 {

	public static void main(String[] args) {
		for (int k = 0; k < 2; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = 2; i <= 5; i++) {
					int newi = i + k * 4;
					int result = i * newi;
					System.out.print(newi + "x" + j + "=" + result + "\t");
				}
				System.out.println();
			}
		}
		System.out.println("---");
	}

}
