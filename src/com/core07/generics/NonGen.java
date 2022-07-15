package com.core07.generics;

public class NonGen {
	Object obj;
	public NonGen(Object oj) {
		obj=oj;
	}
	Object getObj() {
		return obj;
	}
	void showType() {
		System.out.println("Type of T is: "+ obj.getClass().getName());
	}
}
