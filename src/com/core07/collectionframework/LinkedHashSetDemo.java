package com.core07.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		HashSet<String> hs=new HashSet<>();
		lhs.add("789");
		lhs.add("Linked");
		lhs.add("Hash");
		lhs.add("852");
		lhs.add("Set");
		lhs.add("963");
		hs.add("357");
		hs.add("241");
		hs.add("689");
		lhs.addAll(hs);
		//System.out.println(lhs.contains("123")); // hs.contains(lhs)
		//System.out.println(lhs.retainAll(hs));
		//System.out.println(lhs.size());
		//System.out.println(lhs.remove("789"));
		//System.out.println(lhs);
		//System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		lhs.clear();
		System.out.println(lhs.isEmpty());

	}

}
