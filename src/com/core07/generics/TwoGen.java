package com.core07.generics;

public class TwoGen<R, G> {
	R obj1;
	G obj2;
	public TwoGen(R o1, G o2) {
		obj1=o1;
		obj2=o2;
	}
	void showType() {
		System.out.println("Type of R is: "+ obj1.getClass().getName());
		
		System.out.println("Type of G is: "+ obj2.getClass().getName());
	}
	R getObj1() {
		return obj1;
	}
	G getObj2() {
		return obj2;
	}

}
