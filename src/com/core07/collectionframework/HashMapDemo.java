package com.core07.collectionframework;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> hs=new HashMap<>();
		hs.put("KEY", 12.01);
		hs.put("Hash", 45.02);
		hs.put("Map", 78.03);
		System.out.println(hs.get("Map"));
		if(hs.containsKey("Test")) System.out.println("true");
		hs.containsValue(852.04);
		hs.remove("Map");
		Set<String> keySet = hs.keySet();
		hs.values();
		System.out.println(hs);

	}

}
