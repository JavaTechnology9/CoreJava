package com.core07.collectionframework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Character> ad=new ArrayDeque<>();
		ad.add('A');
		ad.add('Z');
		ad.add('W');
		ad.add('D');
		ad.offer('O');
		ad.addFirst('F');
		ad.addFirst('G');
		ad.offerFirst('I');
		ad.pollFirst();
		System.out.println(ad);

	}

}
