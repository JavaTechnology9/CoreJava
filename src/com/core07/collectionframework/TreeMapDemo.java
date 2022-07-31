package com.core07.collectionframework;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Character, Float> tm=new TreeMap<>(new TreeMapComparator());
		tm.put('C', 45.01f);
		tm.put('H', 78.02f);
		tm.put('A', 12.3f);
		tm.put('R', 36.4f);
		tm.put('A', 25.5f);
		tm.put('C', 14.6f);
		tm.put('T', 69.7f);
		tm.put('E', 58.8f);
		tm.put('R', 47.9f);
		/*System.out.println(tm.lowerEntry('A'));
		System.out.println(tm.floorEntry('A'));*/
		System.out.println(tm.ceilingEntry('T'));
		System.out.println(tm.higherEntry('T'));
		/*System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.descendingMap());
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.navigableKeySet());*/
		//tm.pollFirstEntry();
		/*for(Character keySet :tm.keySet())
			System.out.println(keySet);
		for(Float values :tm.values())
			System.out.println(values);
		for(Entry<Character, Float> entrySet : tm.entrySet())
			System.out.println(entrySet);*/
		/*System.out.println(tm.subMap('A',  true, 'E',true));
		System.out.println(tm.headMap('R', true));
		System.out.println(tm.tailMap('H', false));*/
		System.out.println(tm);

	}

}
