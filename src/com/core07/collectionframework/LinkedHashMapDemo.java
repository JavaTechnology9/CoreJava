package com.core07.collectionframework;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<>();
		lhm.put('L', 123);
		lhm.put('I', 456);
		lhm.put('N', 789);
		lhm.put('K', 741);
		System.out.println(lhm.get('M'));
		System.out.println(lhm);
	}

}
