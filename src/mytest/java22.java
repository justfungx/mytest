package mytest;

import java.util.Random;

public class java22 {

	public static void main(String[] args) {
		//高斯運算
		int i = 0, sum = 0, n = 90;
		while (i <= n) {
			sum += i++;
		}

		System.out.println("1+2+3+..." + n + "=" + sum);
	}

}
