package com.core07.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		ArrayList<String> al2=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
		al.add("AB");
		al.add(1, "CD");
		al.add("EF");
		al.add("GH");
		al.add("IJ");
		//al.set(0, "EF");
		//al.remove("IJ");
		//al.remove(4);
		//System.out.println(al.size());
		al2.add("String");
		al2.add("Collection");
		al2.add("framework");
		//al.addAll(al2);
		al.addAll(3, al2);
		//System.out.println(al);
		//System.out.println(al.size());
		al3.add(123);
		al3.add(456);
		//if(al.contains("IJ"))System.out.println("true");
		/*if(al.containsAll(al3))System.out.println("true");
		else System.out.println("false");*/
		//al.retainAll(al2);
		//al2.retainAll(al3);
		System.out.println(al);
		//al.removeAll(al2);
		//al.removeIf(filter->filter.endsWith("work"));
		//al.clear();
		//ListIterator<String> listIterator = al.listIterator();
		//System.out.println(listIterator.hasPrevious());
		/*while(listIterator.hasPrevious()) {
			System.out.println("Previous value: " + listIterator.previous());
		}
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+ " ");
			
		}*/
		/*Iterator<String> iterator = al.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next()+" ");*/
		/*ListIterator<String> listIterator = al.listIterator(4);
		while(listIterator.hasNext()) {
			//listIterator.set("789");
			listIterator.add("123");
			System.out.println(listIterator.next());
			//listIterator.remove();
			
		}*/
		/*ListIterator<String> listIterator = al.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
			listIterator.remove();
			
		}*/
		List<String> subList = al.subList(0, 50);
		System.out.println(subList);
		System.out.println(al);
		

	}

}
