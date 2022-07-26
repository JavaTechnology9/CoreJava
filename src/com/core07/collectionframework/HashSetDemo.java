package com.core07.collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		ArrayList<String> al=new ArrayList<>();
		al.add("12");
		al.add("45");
		al.add("78");
		al.add("96");
		hs.add("123");
		hs.add("789");
		hs.add(null);
		//hs.add("123");
		hs.addAll(al);
		//Object[] array = hs.toArray();
		//Object[] array2 = hs.toArray(array);
		//Iterator<String> iterator = hs.iterator();
		//System.out.println(iterator.next());
		//hs.retainAll(al);
		//System.out.println(hs.contains("123"));
		//hs.clear();
		System.out.println(hs);

	}

}
