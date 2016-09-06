package mytest;

import java.util.Arrays;

public class Brand_Poker {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[52]; //設定一副52張的撲克
		for (int i=0; i<poker.length; i++){ // 設定I值 、若小於撲克數52張、I++
			int temp;
			// 檢查機制
			boolean isRepeat;
			do {
				temp = (int)(Math.random()*52);
				isRepeat = false;
				for (int j=0; j<i; j++){
					if (temp == poker[j]){
						isRepeat = true;
						break;
					}
				}
			}while(isRepeat);
			poker[i] = temp;
		}
		
		// 發牌
		int[][] player = new int[4][13];
		for (int i=0; i<poker.length; i++){
			player[i%4][i/4] = poker[i];
		}
		
		// 攤牌
		String[] suit = {"黑桃","紅心","方塊","梅花"};
		String[] value = {"A ","2 ","3 ","4 ","5 ","6 ","7 ",
							"8 ","9 ","10","J ","Q ","K "};
		for (int[] cards :player){
			Arrays.sort(cards);
			for (int card :cards){
				System.out.print(suit[card/13] + value[card%13] + " ");
			}
			System.out.println();
		}
		

	}

}
