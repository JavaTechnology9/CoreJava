package com.core07.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ArrayList<String> al=new ArrayList<>();
		al.add("12");
		al.add("45");
		al.add("78");
		al.add("96");
		ll.add("AB");
		ll.add(1, "CD");
		ll.addFirst("YZ");
		ll.addLast("WX");
		ll.offerFirst("EF");
		ll.set(2, "SET");
		ll.addFirst("96");
		ll.addAll(4,al);
		//System.out.println(ll.remove());
		//ll.remove(3);
		//ll.removeAll(al);
		//ll.retainAll(al);
		//ll.containsAll(al);
		//System.out.println(ll.lastIndexOf("96"));
		//System.out.println(ll.contains("YZ"));
		//System.out.println(ll.get(2));
		/*ListIterator<String> listIterator = ll.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+ " ");
		}
		System.out.println();
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+ " ");
		}*/
		//ll.poll();
		//ll.element();
		ll.peek();
		System.out.println(ll.subList(0, 4));
		System.out.println(ll);

	}

}
