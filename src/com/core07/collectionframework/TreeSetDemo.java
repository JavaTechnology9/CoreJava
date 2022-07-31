package com.core07.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Double> ts=new TreeSet<>(new TreeSetComparator());
		LinkedList<Double> ll=new LinkedList<>();
		ll.add(10.41);
		ll.add(75.23);
		ll.add(96.52);
		ts.add(101.25);
		ts.add(49.87);
		ts.add(63.12);
		ts.add(74.84);
		ts.add(97.32);
		ts.add(145.64);
		ts.add(73.67);
		ts.addAll(ll);
		System.out.println(ts.ceiling(75.23)); //< 75.23
		ts.first();
		ts.pollFirst();
		ts.floor(45.1);
		//System.out.println(ts.first());
		//System.out.println(ts.last());
		/*for(Double dol:ts.tailSet(123.63))
			System.out.print(dol + ", ");*/
		/*SortedSet<Double> subSet = ts.subSet(123.63, 75.23);
		for(Double dol:subSet)
			System.out.print(dol + ", ");*/
		//ts.remove(123.63);
		//ts.retainAll(ll);
		/*for(Object ob:ts.toArray())
			System.out.print(ob+ ", ");*/
		/*Iterator<Double> iterator = ts.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());*/
		System.out.println(ts);

	}

}
