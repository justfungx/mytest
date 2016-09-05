package mytest;

import java.util.LinkedList;

public class java43 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1,4); //插入 擺在序列前
		
		list.add(12); //可重複性
		list.add("kkl");
		list.add(532);
		list.add(12);
		list.add("kkl");
		list.add(532);
		System.out.println(list.toString());
		}
}
