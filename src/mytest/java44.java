package mytest;

import java.util.HashMap;

public class java44 {

	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put("name", "Brad");
		map.put("w", 80);
		map.put("gender", true);
		System.out.println(map.get("name"));
	}

}