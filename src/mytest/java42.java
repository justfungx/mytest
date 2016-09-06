package mytest;

import java.util.TreeSet;

public class java42 {
//序列性 大樂透 Hashset
	
	//TreeSet 排序性
	
	
	public static void main(String[] args) {
	TreeSet set  = new TreeSet();
//		HashSet set = new HashSet();
		while(set.size()<6){
			set.add((int)(Math.random()*49+1));
		}
System.out.println(set.toString());
	}

}
