package mytest;

import java.util.HashSet;

public class java41 {

	public static void main(String[] args) {
	HashSet set = new HashSet();
	set.add(12); // int = Auto-Boxing => Integer
	set.add("Shok");
	set.add(123.3);
	set.add(new Student("Back",1,2,3));
	set.add(new Student("Back",1,2,3));
	set.add("Shok");
	set.add(12);
	System.out.println(set.size());
	System.out.println(set.toString());
	System.out.println();
	}

}
