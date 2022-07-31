package com.core07.collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Double> pq=new PriorityQueue<>();
		TreeSet<Double> ts=new TreeSet<>();
		ts.add(78.1);
		ts.add(148.6);
		ts.add(85.7);
		ts.add(65.7);
		pq.add(96.4);
		pq.add(12.4);
		pq.add(78.3);
		pq.add(45.2);
		pq.add(56.5);
		pq.add(96.4);
		pq.addAll(ts);
		/*Iterator<Double> iterator = pq.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + ", ");*/
		//pq.remove();
		//pq.remove(96.4);
		//pq.retainAll(ts); // [65.7, 78.1, 85.7, 148.6]
		pq.removeAll(ts);  //[12.4, 45.2, 56.5, 96.4, 78.3, 96.4]
		System.out.println(pq);

	}

}
