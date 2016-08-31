package mytest;

import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class java09 {

	public static void main(String[] args) {
		double temp = Math.random();
		int score = (int)(temp*101  ); // 0-100 , temp*101
		//int score = (int)(temp*40); // 40-69
//		System.out.println(score);
//		if(score >= 60);
//		{
//		System.out.println("pass");
//	}
//		else{
//		System.out.println("down");
//	}
//	}
		System.out.println(score);
		if (score >= 90){
			System.out.println("A");
		}else {
			if(score >= 80){
				System.out.println("B");
			}else{
				if(score >= 70){
					System.out.println("C");
				}else{
					if (score >= 60){
						System.out.println("D");
				}else{
					
						System.out.println("E");
				
				
				}
			}
		}
	}
		
 }
}