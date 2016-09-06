package mytest;

public class poker {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int [52];//52張牌
		for (int i = 0; i<poker.length ; i++){
		int temp ;
		
		//檢查機制
		boolean isreplay;
		do{
			temp = (int)(Math.random()*52); //隨機發出52張牌並檢查重複
			isreplay =false; //發牌出現重複。再回到重新發牌
			for(int j = 0 ;j<i ; i++){
				if (temp == poker[j]){
					isreplay = true ;
					break;
				}
			}
		}while(isreplay);
		poker[i] = temp;
		System.out.println(temp);
		
		}
		//發牌
		int [][] player = new int [4][13];
		for(int i =0; i<poker.length; i++){
		player[i%4][i/4]=poker[i];	
		System.out.println("---");
		}
		//
		String[] suit = {"黑桃","紅心","方塊","梅花"};
		String[] value ={"A","2","3","4","5","6","7","8","9","10",
				"J","Q","K"};
		
		for(int[] cards:player ){
			for(int card:cards){
				System.out.print(suit[card/13]+value[card%13]+card+ " ");
			}
			System.out.println();
		}
	}

}
