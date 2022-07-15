package com.core07.Inheritance;

public class MethodOverideB extends MethodOverideA{
	private int k;
	public MethodOverideB(int a, int b, int c) {
		super(a, b);
		k=c;
	}
	void show() {
		System.out.println("k value:"+ k);
		//super.show();
	}

}
